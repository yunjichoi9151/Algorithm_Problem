class Queue {
  constructor() {
    this.arr = [];
  }

  add(n) {
    this.arr.push(n);
  }

  poll() {
    return this.arr.shift();
  }

  isEmpty() {
    return this.arr.length === 0;
  }
}

const [N, K] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const time = new Array(100001).fill(0);
const que = new Queue();
const visited = new Array(100001).fill(false);
que.add(N);
visited[N] = true;
while(!que.isEmpty()) {
  const now = que.poll();
  for(let i of [now - 1, now + 1, now * 2]) {
    if(i >= 0 && i <= 100000 && !visited[i]) {
      visited[i] = true;
      que.add(i);
      time[i] = time[now] + 1;
    }
  }
}
console.log(time[K]);