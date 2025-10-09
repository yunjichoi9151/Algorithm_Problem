class Queue {
  constructor() {
    this.arr = [];
    this.head = 0;
  }
  add(num) {
    this.arr.push(num);
  }
  poll() {
    return this.arr[this.head++];
  }
  isEmpty() {
    return this.arr.length === this.head;
  }
}

const [A, B] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const que = new Queue();
const visited = new Set();
que.add({x : B, cnt : 1});
visited.add(B);
while(!que.isEmpty()) {
  const node = que.poll();
  if(node.x === A) {
    console.log(node.cnt);
    return;
  }
  if(node.x % 10 === 1 && !visited.has(Math.floor(node.x / 10)) && node.x / 10 >= A) {
    que.add({x : Math.floor(node.x / 10), cnt : node.cnt + 1});
    visited.add(Math.floor(node.x / 10));
  }
  if(node.x % 2 === 0 && !visited.has(node.x / 2) && node.x / 2 >= A) {
    que.add({x : node.x / 2, cnt : node.cnt + 1});
    visited.add(node.x / 2);
  }
}
console.log(-1);