
class Stack {
  constructor() {
    this.arr = [];
  }

  push(item) {
    this.arr.push(item);
  }

  pop() {
    return this.arr.pop();
  }

  peek() {
    return this.arr[this.arr.length - 1];
  }

  getSize() {
    return this.arr.length;
  }

  isEmpty() {
    return this.arr.length === 0;
  }
}

const lines = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const ans = [];

for (let i = 0; i < lines.length; i++) {
  if (lines[i] === '.') break;

  const stack = new Stack();
  let isTrue = true;

  for (let ch of lines[i]) {
    if (ch === '(' || ch === '[') {
      stack.push(ch);
    } else if (ch === ')') {
      if (stack.isEmpty() || stack.peek() !== '(') {
        isTrue = false;
        break;
      }
      stack.pop();
    } else if (ch === ']') {
      if (stack.isEmpty() || stack.peek() !== '[') {
        isTrue = false;
        break;
      }
      stack.pop();
    }
  }

  ans.push((isTrue && stack.isEmpty()) ? 'yes' : 'no');
}
console.log(ans.join('\n'));
