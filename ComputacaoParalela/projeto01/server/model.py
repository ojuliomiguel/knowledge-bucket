import sqlite3, sys, os

def conectar():
	try:
		url = os.path.abspath('bd.sqlite3')
		return sqlite3.connect(url)
	except:
		print("Erro ao conectar ao banco de dados:", sys.exc_info()[0])
		raise

def executeSql(sql):
	conn = conectar()
	conn.execute(sql)
	conn.commit()
	conn.close()

def executeInsert(sql, dados, path):
	conn = conectar()
	conn.execute(sql, (dados,path))
	conn.commit()
	conn.close()

def verificar(nomeTabela):
	sql  = "SELECT * FROM sqlite_master WHERE type='table' AND name = '"+nomeTabela+"';"
	conn = conectar()
	cursor = conn.execute(sql)
	resultado = cursor.fetchone()
	conn.close()
	return resultado

def select(sql):
	conn = conectar()
	cursor = conn.execute(sql)
	lista = []
	for row in cursor:
		lista.append([row[0], row[1], row[2]])
	return lista

class Mensagens():
	@staticmethod
	def criarTabela():
		sql = """CREATE TABLE IF NOT EXISTS `M_MENSAGENS` (
		`M_ID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
		`M_MENSAGEM`	TEXT NOT NULL,
		'M_PATH_ARQUIVO' TEX NOT NULL
	);"""
		executeSql(sql)
	@staticmethod
	def gravarMensagem(dados, path):
		sql = """INSERT INTO M_MENSAGENS (M_MENSAGEM, M_PATH_ARQUIVO) VALUES (?, ?)"""
		executeInsert(sql, dados, path)

	@staticmethod
	def lerMensagem():
		sql = "SELECT * FROM M_MENSAGENS"
		return select(sql)
	@staticmethod
	def lerPath(id):
		sql = "SELECT * FROM M_MENSAGENS WHERE M_ID="+str(id)
		lista = select(sql)
		return lista[0][2] # path


def gerarBanco():
	Mensagens.criarTabela()