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
const [[M, N, H], ...arr] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
let need = 0;
const map = [];
for(let h = 0; h < H; h++) {
  map.push(arr.slice(h * N, (h + 1) * N));
}
const que = new Queue();
const dh = [-1, 1, 0, 0, 0, 0];
const dx = [0, 0, -1, 1, 0, 0];
const dy = [0, 0, 0, 0, -1, 1];
for(let h = 0; h < H; h++) {
  for(let i = 0; i < N; i++) {
    for(let j = 0; j < M; j++) {
      if(map[h][i][j] === 0) need++;
      else if(map[h][i][j] === 1) que.add({h : h, x : i, y : j, cnt : 0});
    }
  }
}
if(need === 0) {
  console.log(0);
  return;
}
while(!que.isEmpty()) {
  const node = que.poll();
  for(let i = 0; i < 6; i++) {
    const nh = node.h + dh[i];
    const nx = node.x + dx[i];
    const ny = node.y + dy[i];
    if(nh < 0 || nx < 0 || ny < 0 || nh >= H || nx >= N || ny >= M || map[nh][nx][ny] != 0) continue;
    que.add({h : nh, x : nx, y : ny, cnt : node.cnt + 1});
    map[nh][nx][ny] = 1;
    need--;
    if(need === 0) {
      console.log(node.cnt + 1);
      return;
    }
  }
}
console.log(-1);