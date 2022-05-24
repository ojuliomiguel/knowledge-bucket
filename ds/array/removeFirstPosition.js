Array.prototype.reIndex = function(arr) {
  const newArray = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== undefined)
      newArray.push(arr[i])
  }
  return newArray;
}

Array.prototype.removeFirstPosition = function() {
  for (let i = 0; i < this.length; i++) {
    this[i] = this[i + 1];    
  }
  return this.reIndex(this)
}

const elements = [1, 2, 3, 4, 5];

const newElements = elements.removeFirstPosition()

console.log(newElements);
