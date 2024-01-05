# Dia 12

- [Dia 12](#dia-12)
  - [Pista Rápida](#pista-rápida)
    - [Insight](#insight)
    - [Registrar um Domínio Próprio](#registrar-um-domínio-próprio)
    - [Configurar o Servidor de DNS](#configurar-o-servidor-de-dns)
    - ["Chorinho" sobre Servidor de DNS](#chorinho-sobre-servidor-de-dns)
  - [Irá retornar alguns IPS (GeoDNS - ip mais próximo de quem está requisitando.)](#irá-retornar-alguns-ips-geodns---ip-mais-próximo-de-quem-está-requisitando)


## Pista Rápida

A pista rápida do dia 12 mostra os tópicos que serão abordados ao longo das aulas:

- Comprar domínio .com.br
  - Como a internet é modificada ao registrar um domínio, qual o papel de um registrador etc.
- Servidor Autoritativo
- Aula extra
  - Capture the flag

### Insight 

> Bomba de efeito moral: O princípio do uso dela não é para ferir, mas sim para paralisar pelo susto.
> As bombas de efeito moral podem nos acontecer diariamente quando lidamos com problemas inesperados que nos paralisam. 
> Para que tenhamos resiliência e não mais fiquemos paralisados pela bomba - que não nos causa dano físico, devemos nos expor a ela 
> sempre que possível ao brincarmos/desenvolvermos nossos projetos pessoais.

### Registrar um Domínio Próprio

A aula deste dia foi para registrar um domínio no site `registro.br` e apresentação da ferramenta `whatsmydns.net`.
Para que efetivamente possamos registrar um domínio entramos como um Registrant. Nós não podemos diretamente realizar o registro, por isso precisamos de uma interface que seria o Registrador (ex: registro.br, HostGator etc.).
Quando escolhemos um nome de domínio o registrador consulta-o para saber se está disponível na lista do Registry. 
Para o `.br` a entidade reguladora [NIC.br](https://nic.br) atua como uma ICANN (Internet Corporation for Assigned Names and Numbers) onde verifica a disponibilidade para registro efetivo e propaga-o ao redor do mundo.

![Alt text](/curso.dev/assets/fluxo_registro_dns.png)

### Configurar o Servidor de DNS

Após o domímio `onetab.com.br` ter sido registrado pelo registrador `registro.br` foi necessário apontar para o servidor
autoritativo - que neste caso seria a vercel para que assim o site/domínio aponte para os recursos desejados.

### "Chorinho" sobre Servidor de DNS

Nesta aula adicional, foi explicado o uso da ferramenta de linha de comando chamada `dig`. O dig (Domain Information Groper) é uma 
ferramenta para consultar informações de DNS e diagnosticar problemas relacionados ao DNS.

```bash
dig curso.dev +trace
```
O comando acima irá mostrar todo processo de resolução de DNS para o domínio `curso.dev`:

1. Consulta aos Roots servers

```bash
. 518400 IN NS a.root-servers.net.
...
. 518400 IN NS m.root-servers.net
```
Os servidores raiz irão informar quais são os servidores responsáveis pelos domínios de topo (TLDs), como `.com`, `.net`,
`.dev`, etc.

2. Consulta ao TLD Server para .dev

```bash
dev. 172800 IN NS ns-tld1.charlestonroadregistry.com.
...
dev. 86400 IN DS 60074 8 2 B942E2CE5AEBF62FCA59D05707E6DBB795211D540D8ADBA02E9E89E8 33424785
```
Estes servidores vão indicar quais são os servidores de nomes autoritativos para o domínio específico `curso.dev`

3. Consulta ao Nameserver Autoritativo para o curso.dev

```bash
curso.dev. 10800 IN NS terry.ns.cloudflare.com.
curso.dev. 10800 IN NS gwen.ns.cloudflare.com.
```
O dig agora sabe onde obter as informações definitivas para o domínio `curso.dev`.

3. Resposta Final com o Enderenço IP

```bash
curso.dev. 300 IN A 104.26.13.195
curso.dev. 300 IN A 172.67.74.250
curso.dev. 300 IN A 104.26.12.195
```
Por fim, os servidores da Cloudflare fornecem os registros de endereço IP (A records) para `curso.dev`.

O dig também é capaz de buscar DNS Records. Exemplo:

```bash
dig curso.dev A
```
Irá retornar alguns IPS (GeoDNS - ip mais próximo de quem está requisitando.)  
--- 
- [Anterior](/curso.dev/dias/dia11.md) - [Próximo](/curso.dev/dias/dia13.md) - [Sumário](../readme.md)
