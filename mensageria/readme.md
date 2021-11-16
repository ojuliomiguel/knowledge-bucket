# Mensageria

## Apache Kafka

> Palavras-chaves: **produtores**, **consumidores**, **tópicos**, **partições**, **offsets**, **eventos**

É uma plataforma para processamento distribuído de eventos.
Usos comuns do kafka:

 * mensageria
 * desacoplamento na comunicação entre sistemas

## Definições 

###  Eventos

Representa um fato que ocorreu no passado. Eventos são imutáveis e nunca permanece em um único lugar.

###  Streams 

Um stream de eventos representa eventos relacionados em movimento. 

 ### Tópicos

 Os tópicos são recursos utilizados para que as mensagens produzidas possam ser consumidas por interessados. Uma maneira simples de se pensar em um tópico é seguir uma hashtag no instagram. Se você tem interesse em gatos, por exemplo, ao seguir #gatos você está - por assim dizer - inscrevendo-se em um tópico na qual toda publicação para o mesmo notificará os interessados (consumidores).
 
 ### Produtores e consumidores

 De maneira técnica, os tópicos representam fluxos de eventos que desacomplam a comunicação entre sistemas, pois produtores e consumidores não precisam se conhecer, basta apenas ter um canal de comunicação que neste caso chamamos de tópico.

### Partições

Para cada tópico o kafka irá criar partições. Essa distribuição das mensagens é importate pela questão da **escalabilidade** no qual permite que várias aplicações clientes leiam e escrevam dados respectivamente de vários **brokers** ao mesmo tempo

<p align="center">
    <img align="center" alt="GIF" src="https://kafka.apache.org/images/streams-and-tables-p1_p4.png" width="500" height="290" />
    <h5 align="center"> 
    Descrição: Na imagem notamos 4 tópicos. Dois producers estão publicando mensagens independente um do do outro. 
    </h5>
</p>

### Atribuições de mensagem nas partições

Uma mensagem quarda em um tópico no kafka segue a seguinte estrutura:


### Fluxos de mensagem
Cada mensagem produzida por um producer precisa ser commitada (cada offset) no consumer para saber quais mensagens já foram processadas

<p align="center">
    <img align="center" alt="GIF" src="https://newrelic.com/sites/default/files/wp_blog_inline_files/offset_explained2-1024x383.jpg" height="250" width="600"  />
</p>

### Materiais

[Kafka The Definitive Guide](https://bit.ly/3ox2tn2)

[Effective Kafka](https://bit.ly/3DneBNj)