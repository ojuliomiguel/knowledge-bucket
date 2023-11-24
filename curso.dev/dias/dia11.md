# Dia 11

## DSN - Domain Name System.

Na primeira aula do dia 11 foi abordado a respeito da dinâmica do funcionamento dos websites.
Todo e qualquer site, por exemplo: `www.google.com` não é pelo endereço (textual) que nosso computador consegue se comunicar,
mas através do enderenço IP que remete a esse site. Então, para que o nosso computador saiba como acessar ao site, ele requisita a um servidor de DNS, que ao identificar site `www.google.com` ele retornará o seu endereço IP para que assim, a minha máquina possa realizar a requisição para o site. 

O Diagrama abaixo ilustra bem essa dinâmica:

![Alt text](/curso.dev/assets/fluxo_dns.png)

## Link secreto

Como desafio da primeira aula deste dia Deschamps propôs um desafio de achar o link da
aula escondida - desafio foi extremamente simples mas a lição e o ouro desta aula `secreta`:

> Você não pode ter medo de quebrar as coisas que você está construíndo!

## Resolução de DSN (Desafio 2)

Quando vamos acessar um site, como o `www.tabnews.com.br` o SO faz uma requsição pela rede para o meu provedor de internet que possui um negócio chamado
Recursive Resolver. Que, como próprio nome sugere, vai de forma recursiva buscar pelo enderenço ip para que assim nossa máquina
consiga acessar o site.
Todo site terminar com um ponto - Fully Qualified Domain Name, então na verdade o site do tabnews ou qualquer outro, por exemplo
ficaria assim: `www.tabnews.com.br.`. O ponto no final do site representa o Root Server, onde ele irá identificar o .br que é o TLD ()
Top-Level Domain para que assim ele localize dessa vez o ip do site através do Authoritative Server onde há os registros de DSN.

![Alt text](/curso.dev/assets/fluxo_completo_dns.png)

Para evitar que toda request faça esse percurso, existe uma estratégia de usar TTL Time To live. 
Essa estratégia define quanto tempo um registro deve ficar no cache.

> Encare os desafios técnicos olho-no-olho e eles ficarão mansos.

## Desafio

[Building a Recursive DNS Resolver](https://timothya.com/blog/dns/#writing-a-recursive-resolver)


### Recoursos:

[How DNS Works](https://howdns.works/pt-br/ep1/)
--- 
- [Anterior](/curso.dev/dias/dia10.md) - [Próximo](/curso.dev/dias/dia11.md) - [Sumário](../readme.md)
