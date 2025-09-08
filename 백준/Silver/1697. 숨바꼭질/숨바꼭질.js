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

const [N, K] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const que = new Queue();
const visited = new Array(100001).fill(false);
que.add({x : N, time : 0});
visited[N] = true;
while(!que.isEmpty()) {
  const node = que.poll();
  if(node.x === K) {
    console.log(node.time);
    return;
  }
  if(node.x * 2 <= 100000 && !visited[node.x * 2]) {
    que.add({x : node.x * 2, time : node.time + 1});
    visited[node.x * 2] = true;
  }
  if(node.x - 1 >= 0 && !visited[node.x - 1]) {
    que.add({x : node.x - 1, time : node.time + 1});
    visited[node.x - 1] = true;
  }
  if(node.x + 1 <= 100000 && !visited[node.x + 1]) {
    que.add({x : node.x + 1, time : node.time + 1});
    visited[node.x + 1] = true;
  }
}