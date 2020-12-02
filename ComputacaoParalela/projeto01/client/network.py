from threading import Thread
import socket

class ClientThread(Thread):
	def __init__(self): 
		Thread.__init__(self)
 
	def run(self): 
		host = socket.gethostname() 
		port = 1277
		BUFFER_SIZE = 2000 
		tcpClientA = socket.socket(socket.AF_INET, socket.SOCK_STREAM) 
		tcpClientA.connect((host, port))
			
		while True:
			text = input("Digite um texto\n")
			tcpClientA.send(text.encode())
			# data = tcpClientA.recv(BUFFER_SIZE)
			tcpClientA.close() 

if __name__ == '__main__':
	clientThread=ClientThread()
	clientThread.start()