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
    return this.head === this.arr.length;
  }
}

const [[N, M], ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const arr = Array.from({length : N + 1}, () => []);
for(let i = 0; i < M; i++) {
  arr[input[i][0]].push(input[i][1]);
  arr[input[i][1]].push(input[i][0]);
}
const que = new Queue();
const visited = new Array(N + 1).fill(false);
let cnt = 0;
for(let i = 1; i <= N; i++) {
  if(!visited[i]) {
    que.add(i);
    visited[i] = true;
    cnt++;
    while(!que.isEmpty()) {
      const node = que.poll();
      for(let num of arr[node]) {
        if(!visited[num]) {
          visited[num] = true;
          que.add(num);
        }
      }
    }
  }
}
console.log(cnt);