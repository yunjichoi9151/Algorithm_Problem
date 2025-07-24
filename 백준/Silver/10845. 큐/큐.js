class Deque {
  constructor() {
    this.arr = [];
    this.head = 0;
    this.tail = 0;
  }

  peekFirst() {
    return this.arr.length === 0 ? -1 : this.arr[0];
  }

  peekLast() {
    return this.arr.length === 0 ? -1 : this.arr[this.arr.length - 1];
  }

  size() {
    return this.arr.length;
  }

  isEmpty() {
    return this.arr.length === 0 ? 1 : 0;
  }

  pop() {
    return this.arr.length === 0 ? -1 : this.arr.shift();
  }

  push(num) {
    this.arr.push(num)
  }
}

let [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
N = Number(N);
let deque = new Deque();
const ans = [];
for(let i = 0; i < N; i++) {
  if(input[i] === 'front') {
    ans.push(deque.peekFirst());
  } else if(input[i] === 'back') {
    ans.push(deque.peekLast());
  } else if(input[i] === 'size') {
    ans.push(deque.size());
  } else if(input[i] === 'empty') {
    ans.push(deque.isEmpty());
  } else if(input[i] === 'pop') {
    ans.push(deque.pop());
  } else {
    deque.push(Number(input[i].split(' ')[1]));
  }
}
console.log(ans.join('\n'));