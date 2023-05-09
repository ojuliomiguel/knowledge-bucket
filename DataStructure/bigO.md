# Notação Big O

> T = an + b = O(n)
  * a e b sendo "tempos" de execuções é desconsiderado por ser pequeno.

Big O diz respeito a como extrair métricas do código.

## Tempo constante: O(1): independe da quantidade de itens para sua execução

Exemplo:

```js
/**
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
const countOdds = function(low, high) {
  const arraySize = Math.floor(high - low) + 1;
  const isArraySizeOdd = arraySize % 2 !== 0;
  const isFirstNumberOdd = low % 2 !== 0 
  
  if (isArraySizeOdd && isFirstNumberOdd) {
    const qtde = Math.floor(arraySize / 2) + 1;
    return qtde;
  }
  return Math.floor(arraySize / 2)
};
```

## Tempo linear: O(n): Quando o tempo do algorítmo depende do valor "n".

Exemplo: 

```py
def find_sum(arr):
  sum = 0 # tempo constante
  for item in arr: # tempo varia em função da qtde de elementos de arr
    sum += item
  return sum # tempo constante
```
## Tempo logarítmico: O (log n): Quando o algorítimo reduz o tamanho de dados de entrada a cada iteração.

Exemplo: Busca binária

![Busca Binária](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQoNCeVY_sUboCudFjLnaWR-DR4iIF5vXzZYA&usqp=CAU)

## Tempo exponencial: O (2^n): 
Muitas vezes são algorítmos recursivos que resolvem um problema de tamanho N recursivamente resolvendo em dois problemas menores de tamanho N-1.

```py
def fibonacci(num):
  if num <= 1:
    return num
  return fibonacci(num-2) + fibonacci(num-1)
```

## Tempo fatorial: O(n!): cresce de forma fatorial de acordo com a entrada de dados!