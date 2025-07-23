class Stack {
  constructor() {
    this.arr = [];
  }

  push(num) {
    this.arr.push(num);
  }

  pop() {
    return this.arr.pop();
  }

  peek() {
    return this.arr[this.arr.length - 1];
  }

  size() {
    return this.arr.length;
  }

  isEmpty() {
    return this.arr.length === 0;
  }
}
const [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(Number);
let stack = new Stack();
let sum = 0;
for(let i = 0; i < N; i++) {
  if(input[i] === 0) {
    sum -= stack.pop();
  } else {
    stack.push(input[i]);
    sum += input[i];
  }
}
console.log(sum);