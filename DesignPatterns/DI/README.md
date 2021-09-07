# Injeção de Dependência e Inversão de Controle (DI e IoC)

## O que é uma dependência?

> Dependencia significa contar com algo para suporte.

## O que Injeção de Dependência significa na programação?

> Quando uma classe *A* usa alguma funcionalidade de uma classe *B*, então é dito que a classe *A* tem dependência com a classe *B*

Transferir a responsabilidade de criar um objeto para outra coisa que não seja a classe que utiliza e utilizar diretamente a dependência é o que se chama de DI (Dependecy Injection)

## Responsabilidades da DI

 - Criar objetos
 - Saber quais classes precisam desses objetos
 - E prover esses objetos para estas classes

 ## Inversão de controle - O conceito por trás da DI

 Classes não devem configurar suas dependências estaticamente mas devem ser configuradas por alguma outra classe externa.

 S.O.L.I.**D** -> Classes devem depender de abstrações e não de tipos concretos.

 Uma classe deve se concentrar em cumprir suas responsabilidades e não em criar objetos que são requeridos para cumprir estas resposabilidades.


### Referências


[Freecodecamp](https://www.freecodecamp.org/news/a-quick-intro-to-dependency-injection-what-it-is-and-when-to-use-it-7578c84fa88f/)