import socket
from threading import Thread
import random, json, time
from model import *
from datetime import datetime

class ProcessadorDeDados(Thread): 
 
	def __init__(self,ip,port, conn): 
		Thread.__init__(self)
		self.ip = ip 
		self.port = port
		self.conn = conn
		print("[+] New server socket thread started for " + ip + ":" + str(port)) 
		print(conn)

	def run(self): 
		while True :  
			data = self.conn.recv(2048)
			data = data.decode()
			print(data)
			y = json.loads(data)
			if y["operacao"] == "envmensagem":
				"""Recebe um arquivo e grava na pasta"""
				text = y["dados"]
				nomeArquivo = y["nomeArquivo"]
				print(text)
				data = self.conn.recv(204800000)
				now = datetime.now()
				nomeDoArquivo = "arquivos/"+str(now.hour)+str(now.minute)+str(now.second)+nomeArquivo
				Mensagens.gravarMensagem(text, nomeDoArquivo)
				with open(nomeDoArquivo, 'wb') as file:
					print("Escrevendo o arquivo")
					print(data)
					file.write(data)
			elif y["operacao"] == "getMensagens":
				"""Envia a lista de mensagens disponiveis para baixar"""
				lista = Mensagens.lerMensagem()
				dicio = {"operacao": "lista", "dados": lista}
				x = json.dumps(dicio)
				self.conn.send(x.encode())
			elif y["operacao"] == "download":
				"""Receber o id, e envia o arquivo relacionado"""
				id = y["dados"]
				print(id)
				dicio = {"operacao": "receberArquivo"}
				x = json.dumps(dicio)
				self.conn.send(x.encode())
				path = Mensagens.lerPath(id)
				with open(path, "rb") as file:
					data = file.read()
					print("Tamanho: ============="+str(len(data)))
					self.conn.send(data)
					print("Enviou")


class ServerThread(Thread):
	def __init__(self): 
		Thread.__init__(self)

 
	def run(self): 
		TCP_IP = '0.0.0.0' 
		TCP_PORT = 7007
		BUFFER_SIZE = 2000
		tcpServer = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		tcpServer.bind((TCP_IP, TCP_PORT)) 
		threads = [] 
				
		tcpServer.listen(30) 
		while True:
			print("Multithreaded Python server : Aguardando clientes se conectarem...") 
			(conn, (ip,port)) = tcpServer.accept()
			newthread = ProcessadorDeDados(ip,port, conn) 
			newthread.start() 
			threads.append(newthread)
				
		# Terminando as Threads
		for t in threads: 
			t.join()

if __name__ == '__main__':
	gerarBanco()
	serverThread = ServerThread()
	serverThread.start()