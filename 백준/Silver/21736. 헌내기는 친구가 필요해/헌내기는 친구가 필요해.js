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

let [input, ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
const [N, M] = input.split(' ').map(Number);
map = map.map(line => line.split(''));
const que = new Queue();
const visited = Array.from({length : N}, () => new Array(M).fill(false));
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
let ans = 0;
for(let i = 0; i < N; i++) {
  for(let j = 0; j < M; j++) {
    if(map[i][j] === 'I') {
      que.add({x : i, y : j});
      visited[i][j] = true;
    }
  }
}
while(!que.isEmpty()) {
  const node = que.poll();
  for(let i = 0; i < 4; i++) {
    const nx = node.x + dx[i];
    const ny = node.y + dy[i];
    if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] === 'X') continue;
    que.add({x : nx, y : ny});
    visited[nx][ny] = true;
    if(map[nx][ny] === 'P') ans++;
  }
}
console.log(ans === 0 ? 'TT' : ans);