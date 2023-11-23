# Dia 10

## Uma história macabra sobre "Estilização de Código"

Nesta breve aula o Filipe apresentou o que motiva a utilizar uma padronização de códigos
e das respectivas vantagens. 
Quando se tem um code-base que vai crescendo e onde vários devs atuam o código tende a 
ter a forma de escrita de cada desenvolvedor - o que a longo prazo pode dificultar a 
manutenção, legibilidade etc.
Uma das ferramentas citadas pelo Filipe foi o [JavaScript Standard Style](https://standardjs.com/) -
que na época não era possível fazer configurações personalizads. Um dos casos de uso dessa ferramenta
foi no antigo emprego dele na pagar.me onde o projeto estava tomando grandes proporções e a equipe 
decidiu aplicar no projeto por inteiro (que perigo!) - até os testes (graças a Deus que tinha testes) foram
alterados - mas tudo deu certo.

## Sync das configurações do VSCode do github (Codespaces)

Como o é um ambiente ênfemero aproveitei a aula para ativar a sincronização 
das configurações em um novo perfil diferente o que já uso. Assim, toda vez que 
precisar criar um novo codespaces - as configs serão sincronizadas.

## Definindo configurações do editor

Na terceira aula do dia 10 foi realizado a criação do arquivo `.editorconfig` para assim padronizar
a escrita de código.
O VSCode por padrão não é capaz de ler este arquivo, portanto é necessário instalar a extensão relacionada ao editor.

O arquivo inicialmente ficou:

```
root = true

[*]
indent_style = space
indent_size = 2
```

A aula de hoje conclui a segunda tarefa da issue [Definir estilização do código e configurar editor](https://github.com/ojuliomiguel/tap-to-news/issues/2)

## Configurar o Prettier

Na última aula deste dia, configuramos o [Prettier](https://prettier.io/) para o projeto
visando que tenha-se uma padronização de código e qualidade durante o desenvolvimento. 

```json
"lint:check": "prettier --check .",
"lint:fix": "prettier --write ."
```

Os comandos listados acima foram adicionados ao `package.json` do projeto na seção
`scripts`.
* `lint:check:` faz uma varredura para identificar quais arquivos estão fora do padrão de estilização
* `lint:fix`: realiza as correções identificadas na varredura.

### `.prettierignore`

Alguns alunos identificam que o `lint:check:` estava varrendo a pasta .next. No caso do 
Filipe e o meu também não estava acontecendo porque recriamos o ambiente no codespace. Dessa forma a pasta
.next não existia. Mas o problema pode ser resolvido facilmente adicionando ao projeto:

`.prettierignore`

```
.next
```

--- 
- [Anterior](/curso.dev/dias/dia9.md) - [Próximo](/curso.dev/dias/dia11.md) - [Sumário](../readme.md)
