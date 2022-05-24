Array.prototype.inserFirstPosition = function(value) {
  for (let i = this.length; i >= 0; i--) {
    this[i] = this[i -1];
  }
  this[0] = value;
}

const elements = [1, 2, 3, 4, 5];

elements.inserFirstPosition(0);


