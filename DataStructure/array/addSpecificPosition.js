/*
ADICIONANDO ELEMENTOS DE UMA POSICAÇÃO ESPECÍFICA
*/

const elements = [1, 2, 3, 4, 5];

/*
  O primeiro argumento do método é o índice pelo qual queremos inserir o elemento.
  O segundo argumento é a quantidade de elements que queremos remover (neste caso não iremos remover, por isso 0).
  Do terceiro argumento em diante são os elementos que iremos adicionar a partir da posição especificada
*/
elements.splice(3, 0, 7,8,9);

console.log(elements); // [1, 2, 3, 7, 8, 9, 4, 5]