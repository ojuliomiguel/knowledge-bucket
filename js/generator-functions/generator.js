/* 
  Generator Function returns a Generator Object
  instance Methods:
  Generator.prototype.next() ex: { value: 0, done: false }
  Generator.prototype.return()
  Generator.prototype.throw()
  --- 
  Use cases:
  inifity loop withou lock main stack
*/

function* generator(i) {
  yield i;
  yield i + 10;
}
// const gen = generator(10);

// console.log(gen.next().value);
// console.log(gen.next().value);

/**
 * Infinite iterator:
 * With a generator funtion, values are not evaluated until they are needed
 */
function* idMaker() {
  let index = 0;
  while(true)
    yield index++;
}

const gen = idMaker();
console.log(gen.next());
console.log(gen.next());
console.log(gen.next());
console.log(gen.next());


