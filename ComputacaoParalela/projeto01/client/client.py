from PyQt5.QtWidgets import QMainWindow, QApplication, QDialog, QFileDialog, QTableWidgetItem
from PyQt5 import uic
import sys, socket, json, time
from threading import Thread
import ntpath

pathDownload = ""
tcpClientA = None
lista = None

class ClientThread(Thread):
	def __init__(self): 
		Thread.__init__(self)
 
	def run(self): 
		host = socket.gethostname() 
		port = 7007
		BUFFER_SIZE = 2000 
		global tcpClientA
		tcpClientA = socket.socket(socket.AF_INET, socket.SOCK_STREAM) 
		tcpClientA.connect((host, port))
			
		while True:
			"""loop para receber dados do servidor"""
			data = tcpClientA.recv(BUFFER_SIZE)
			data  = data.decode()
			print(data)
			aux = json.loads(data)
			print(aux)
			if aux["operacao"] == "lista":
				global lista
				lista = aux["dados"]
				print(lista)
			elif aux["operacao"] == "receberArquivo":
				print(data)
				print("Recebeu data ======= Path ===============")
				print(pathDownload)
				data = tcpClientA.recv(904800000)
				print("Tamanho: ==========="+str(len(data)))
				with open(pathDownload, "wb") as file:
					file.write(data)
		
		tcpClientA.close()

class JanelaAdicionar(QDialog):
	"""Dialogo de enviar os arquivos"""
	def __init__(self):
		super(JanelaAdicionar, self).__init__()
		uic.loadUi('views/adicionarMsg.ui',self)
		self.anexarArquivo.clicked.connect(self.getfiles)
		self.enviar.clicked.connect(self.enviarMensagem)
		self.setWindowTitle("GAC")
		self.show()

	def getfiles(self):
		"""Pega do usuário o nome do arquivo a ser enviado"""
		dlg=QFileDialog()
		dlg.setFileMode(QFileDialog.AnyFile)
		dlg.setNameFilter("file (*.*)")
		if dlg.exec_():
			filenames=dlg.selectedFiles()
			print("Filename ==============" + str(filenames)) #retorna um lista com endereços
			self.path = filenames[0]

	def enviarMensagem(self):
		"""Envia uma mensagem com um arquivo para o servidor"""
		msg = self.textEdit.toPlainText()
		dicio = {"operacao": "envmensagem", "dados": msg, "nomeArquivo": ntpath.basename(self.path)}
		x = json.dumps(dicio)
		global tcpClientA
		tcpClientA.send(x.encode())
		with open(self.path, 'rb') as file:
			bytesToSend = file.read()
			print(bytesToSend)
			tcpClientA.send(bytesToSend)
		self.close()



class PrincipalJanela(QMainWindow):
	"""Janela principal"""
	def __init__(self):
		super(PrincipalJanela, self).__init__()
		uic.loadUi('views/principal.ui',self)
		self.addMsg.clicked.connect(self.adicionarMsg)
		self.atualizar.clicked.connect(self.atualizaTb)
		self.baixarArquivoBtn.clicked.connect(self.baixarArquivo)
		self.atualizaTb()
		self.setWindowTitle("GAC")
		self.show()

	def adicionarMsg(self):
		"""Chama o dialogo para adicionar arquivos no servidor"""
		x = JanelaAdicionar()
		x.exec_()
		self.atualizaTb()

	def atualizaTb(self):
		"""Função para atualizar lista de arquivos na tabela"""

		# limpando ordenação para atualizar tabelas
		self.tableWidget.setSortingEnabled(False)

		self.tableWidget.setRowCount(0)
		global tcpClientA
		dicio = {"operacao": "getMensagens"}
		x = json.dumps(dicio)
		tcpClientA.send(x.encode())
		time.sleep(0.2)
		self.tableWidget.setRowCount(len(lista))
				
		for i in range(len(lista)):
			self.tableWidget.setItem(i, 0, QTableWidgetItem(str(lista[i][0])))
			print(lista[i][0])
			print(lista[i][1])
			print(lista[i][2])
			self.tableWidget.setItem(i, 1, QTableWidgetItem(lista[i][1]))
			self.tableWidget.setItem(i, 2, QTableWidgetItem(lista[i][2]))
		# habilitando novamente a ordenação
		self.tableWidget.setSortingEnabled(True)
	def baixarArquivo(self):
		"""Solicita ao servidor o arquivo para ser baixado"""
		linha = self.tableWidget.currentRow() # linha selecionado pelo usuário
		item = 0
		if linha > -1: # cellChanged retorna -1 caso não tenha nenhuma celula com mudança
			item = self.tableWidget.item(linha, 0)
			options = QFileDialog.Options()
			options |= QFileDialog.DontUseNativeDialog
			global pathDownload
			pathDownload, _ = QFileDialog.getSaveFileName(self,"QFileDialog.getSaveFileName()","","All Files (*);", options=options)
			dicio = {"operacao": "download", "dados": item.text()}
			x = json.dumps(dicio)
			global tcpClientA
			tcpClientA.send(x.encode())

if __name__ == '__main__':
	clientThread=ClientThread()
	clientThread.start()
	app = QApplication(sys.argv)
	frame = PrincipalJanela()
	sys.exit(app.exec_())