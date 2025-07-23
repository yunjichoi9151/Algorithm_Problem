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

let [T, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const answer = [];
input = input.map(line => line.trim().split(''));
T = Number(T);
for(let i = 0; i < T; i++) {
  let stack = new Stack();
  let isTrue = true;
  for(let j = 0; j < input[i].length; j++) {
    if(input[i][j] == '(') stack.push('(');
    else {
      if(stack.isEmpty() || stack.peek() !== '(') {
        isTrue = false;
        answer.push('NO');
        break;
      } else {
        stack.pop();
      }
    }
  }
  if(isTrue) answer.push(stack.isEmpty() ? 'YES' : 'NO');
}
console.log(answer.join('\n'));