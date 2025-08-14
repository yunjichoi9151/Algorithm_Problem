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
    return this.head >= this.arr.length;
  }
}

const [[M, N], ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
let sum = M * N;
let tomato = 0;
const que = new Queue();
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
for(let i = 0; i < N; i++) {
  for(let j = 0; j < M; j++) {
    if(map[i][j] === 1) {
      que.add({x : j, y : i, cnt : 0});
      tomato++;
    } else if(map[i][j] === -1) {
      sum--;
    }
  }
}
if(sum === tomato) {
  console.log(0);
  return;
}
let day = 0;
while(!que.isEmpty()) {
  const node = que.poll();
  day = node.cnt;
  for(let i = 0; i < 4; i++) {
    const nx = node.x + dx[i];
    const ny = node.y + dy[i];
    if(nx < 0 || ny < 0 || nx >= M || ny >= N || map[ny][nx] != 0) continue;
    que.add({x : nx, y : ny, cnt : node.cnt + 1});
    map[ny][nx] = 1;
    tomato++;
  }
}
console.log(sum === tomato ? day : -1);