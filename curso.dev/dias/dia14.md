# Dia 14 - Fundação.

## Pista rápida

A pista rápida do dia 14 mostra os tópicos que serão abordados ao longo das aulas:

- Milestone 1: Fundanção
- PoC e MVP
- Conclusão da primeira issue da Milestone 1

## PoC e MVP

### Diferenças entre PoC e MVP

Nesta aula bônus, o conceito de PoC e MVP foi exemplificado de forma bastante didática. Imagine, por exemplo, um grande navio perdido em alto mar, buscando um porto. Utilizar o próprio navio para essa busca seria muito custoso. A melhor estratégia seria empregar pequenos barcos em diversas direções para localizar um porto, ilha, etc. Essa solução exemplifica o conceito de PoC, que permite verificar se uma ideia, método ou conceito é viável na prática. Já o MVP seria a execução dessa prova de conceito, de forma minimamente custosa, mas que ainda entrega valor.
A PoC trata-se de provar que funciona para que assim possa-se desenvolver o mínimo de valor (sem ruídos) com foco na solução para um determinado problema.

## Milestone 1: Fundação

Como o título sugere, esta aula reservou-se para abrir a Milestone 1 e suas respectivas issues para o desenvolvimento do projeto.

Link: [Milestone 1](https://github.com/ojuliomiguel/onetab/milestone/2)

## Overengineering 

Um software deve responder sempre uma pergunta: o quanto é modificável?

![Alt text](/curso.dev/assets/overengineering_graph.png)

Fazer um software robusto, com as melhores práticas da engenharia pode ser um perigo eminente. Podemos nos empolgar inserindo altas engenharias mas sem ter um real motivo para fazê-lo. 
A ideia central, portanto, consiste em começar simples e ir adicionado “complexidades” quando necessário. 
Deschamps faz uma analogia interessante que é a do corte de cabelo: se cortar demais - impossível reverter naquele momento. Mas se cortar aos poucos, pode-se contonar ajustando ao modo desejado do cliente. Um software, portanto, deve nascer simples mas preparado para crescer de forma saudável. 

O Akita tem um manual interessante a respeito de desenvolver software:

	•	Fazer Funcionar
	•	Fazer ficar correto (testes/bugs etc.)
	•	Fazer ficar legível (refatorar, reorganizar)
	•	Fazer ficar seguro (sanitização, leaks, etc)
	•	Fazer ficar escalável (evitar o que puder de coisas bloqueantes, evitar tudo que for global)
	•	Fazer ficar rápido (escovar bit)

Embora a dica do Akita não seja uma prática que leve ao TDD, temos um feedback inicial a respeito do desenvolvimento.

## Proposta de Arquitetura de Pastas

> Architecture is about the important stuff (domain). Whatever that is. - Ralph Johnson

Arquitetura de software != Organização dos arquivos. 

Arquitetura de software trata-se da disposição dos componentes e como eles interagem com o sistema. Diferentemente de arquivos, que podem não ter correlações semânticas etc.
Uma arquitetura de software pode residir em um único arquivo (evidente que não se faz isso) pois o que realmente importa são os componentes e suas relações.
A definição acima, genérica, não define arquitetura em um contexto mais amplo como a frase citada. 
Uma arquitetura de software pode ser entendida também como um conjunto de decisões importantes para um projeto.

--- 
- [Anterior](/curso.dev/dias/dia13.md) - [Próximo](/curso.dev/dias/dia15.md) - [Sumário](../readme.md)





















