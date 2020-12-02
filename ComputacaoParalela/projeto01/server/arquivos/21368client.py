from PyQt5.QtWidgets import QMainWindow, QApplication, QDialog, QFileDialog
from PyQt5 import uic
import sys, socket, json
from threading import Thread
import ntpath


tcpClientA = None

class ClientThread(Thread):
	def __init__(self): 
		Thread.__init__(self)
 
	def run(self): 
		host = socket.gethostname() 
		port = 1277
		BUFFER_SIZE = 2000 
		global tcpClientA
		tcpClientA = socket.socket(socket.AF_INET, socket.SOCK_STREAM) 
		tcpClientA.connect((host, port))
			
		while True:
			data = tcpClientA.recv(BUFFER_SIZE)
			# data = tcpClientA.recv(BUFFER_SIZE)
		tcpClientA.close()

class JanelaAdicionar(QDialog):
	def __init__(self):
		super(JanelaAdicionar, self).__init__()
		uic.loadUi('views/adicionarMsg.ui',self)
		self.anexarArquivo.clicked.connect(self.getfiles)
		self.enviar.clicked.connect(self.enviarMensagem)
		self.setWindowTitle("GAC")
		self.show()

	def getfiles(self):
		dlg=QFileDialog()
		dlg.setFileMode(QFileDialog.AnyFile)
		dlg.setNameFilter("file (*.*)")
		if dlg.exec_():
			filenames=dlg.selectedFiles()
			print("Filename ==============" + str(filenames)) #retorna um lista com endereços
			self.path = filenames[0]
			"""f = open(filenames[0], 'r') #open recebe uma str com 1 endereço
			with f:
				data = f.read()"""
	def enviarMensagem(self):
		msg = self.textEdit.toPlainText()
		dicio = {"operacao": "envmensagem", "dados": msg, "nomeArquivo": ntpath.basename(self.path)}
		x = json.dumps(dicio)
		global tcpClientA
		tcpClientA.send(x.encode())
		with open(self.path, 'rb') as file:
			bytesToSend = file.read()
			print(bytesToSend)
			tcpClientA.send(bytesToSend)
			"""while bytesToSend != "":
				bytesToSent = file.read(1024)
					#print(bytesToSend)
				sock.send(bytesToSend)"""
		self.close()



class PrincipalJanela(QMainWindow):
	def __init__(self):
		super(PrincipalJanela, self).__init__()
		uic.loadUi('views/principal.ui',self)
		self.addMsg.clicked.connect(self.adicionarMsg)
		self.setWindowTitle("GAC")
		self.show()

	def adicionarMsg(self):
		x = JanelaAdicionar()
		x.exec_()


if __name__ == '__main__':
	clientThread=ClientThread()
	clientThread.start()
	app = QApplication(sys.argv)
	frame = PrincipalJanela()
	sys.exit(app.exec_())