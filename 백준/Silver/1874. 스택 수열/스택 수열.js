class Stack {
  constructor() {
    this.arr = [];
  }

  push(num) {
    this.arr.push(num);
  }

  pop() {
    return this.arr.length === 0 ? -1 : this.arr.pop();
  }

  size() {
    return this.arr.length;
  }

  isEmpty() {
    return this.arr.length === 0 ? true : false;
  }

  peek() {
    return this.arr.length === 0 ? -1 : this.arr[this.arr.length - 1];
  }
}

const [N, ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => Number(line.trim()));
let stack = new Stack();
let cnt = 0;
let idx = 0;
let num = 1;
const ans = [];
while (idx < N && cnt <= N * 2) {
  if (!stack.isEmpty() && stack.peek() === input[idx]) {
    stack.pop();
    ans.push("-");
    idx++;
  } else {
    stack.push(num++);
    ans.push("+");
  }
  cnt++;
}
console.log(idx === N ? ans.join("\n") : "NO");
