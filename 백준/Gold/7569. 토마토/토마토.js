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

const [[M, N, H], ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const map = [];
for(let i = 0; i < H * N; i += N) {
  map.push(input.slice(i, i + N));
}
let sum = M * N * H;
let tomato = 0;
const que = new Queue();
const dx = [0, 0, 0, 0, -1, 1];
const dy = [0, 0, -1, 1, 0, 0];
const dz = [-1, 1, 0, 0, 0, 0];
for(let z = 0; z < H; z++) {
  for(let y = 0; y < N; y++) {
    for(let x = 0; x < M; x++) {
      if(map[z][y][x] === 1) {
        que.add({x : x, y : y, z : z, cnt : 0});
        tomato++;
      } else if(map[z][y][x] === -1) {
        sum--;
      }
    }
  }
}
if(sum === tomato) {
  console.log(0)
  return;
}
let day;
while(!que.isEmpty()) {
  const node = que.poll();
  day = node.cnt;
  for(let i = 0; i < 6; i++) {
    const nx = node.x + dx[i];
    const ny = node.y + dy[i];
    const nz = node.z + dz[i];
    if(nx < 0 || ny < 0 || nz < 0 || nx >= M || ny >= N || nz >= H || map[nz][ny][nx] === 1 || map[nz][ny][nx] === -1) continue;
    que.add({x : nx, y : ny, z : nz, cnt : node.cnt + 1});
    map[nz][ny][nx] = 1;
    tomato++;
  }
}
console.log(sum === tomato ? day : -1);
