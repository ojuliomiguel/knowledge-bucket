/*
REMOVENDO ELEMENTOS DE UMA POSICAÇÃO ESPECÍFICA
*/

const elements = [1, 2, 3, 4, 5];

/*
  O primeiro argumento do método é o índice pelo qual queremos inserir o elemento.
  O segundo argumento é a quantidade de elements que queremos remover.
*/

elements.splice(3, 2);

console.log(elements); // [ 1, 2, 3 ]