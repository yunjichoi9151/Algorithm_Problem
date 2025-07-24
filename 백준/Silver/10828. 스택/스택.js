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

  isEmpty() {
    return this.arr.length === 0 ? 1 : 0;
  }

  size() {
    return this.arr.length;
  }
}

let [N, ...arr] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
N = Number(N);
let stack = new Stack();
const ans = [];
for(let i = 0; i < N; i++) {
  if(arr[i] === "top") {
    ans.push(stack.isEmpty() ? -1 : stack.peek());
  } else if(arr[i] === "size") {
    ans.push(stack.size());
  } else if(arr[i] === "empty") {
    ans.push(stack.isEmpty());
  } else if(arr[i] === "pop") {
    ans.push(stack.isEmpty() ? -1 : stack.pop());
  } else {
    stack.push(Number(arr[i].split(' ')[1]));
  }
}
console.log(ans.join('\n'));