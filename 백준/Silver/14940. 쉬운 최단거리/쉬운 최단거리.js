class Queue {
  constructor() {
    this.arr = [];
  }

  add(num) {
    this.arr.push(num);
  }

  poll() {
    return this.arr.shift();
  }

  isEmpty() {
    return this.arr.length === 0;
  }
}

const [[N, M], ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const que = new Queue();
const visited = Array.from({length : N}, () => new Array(M).fill(false));
const ans = Array.from({length : N}, () => new Array(M).fill(0));
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
for(let i = 0; i < N; i++) {
  for(let j = 0; j < M; j++) {
    if(map[i][j] === 2) {
      que.add({x : i, y : j, cnt : 0});
      visited[i][j] = true;
    }
  }
}
while(!que.isEmpty()) {
  const node = que.poll();
  ans[node.x][node.y] = node.cnt;
  for(let i = 0; i < 4; i++) {
    const nx = node.x + dx[i];
    const ny = node.y + dy[i];
    if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] === 0) continue;
    que.add({x : nx, y : ny, cnt : node.cnt + 1});
    visited[nx][ny] = true;
  }
}
for(let i = 0; i < N; i++) {
  for(let j = 0; j < M; j++) {
    if(map[i][j] !== 0 && !visited[i][j]) ans[i][j] = -1;
  }
}
console.log(ans.map(line => line.join(' ')).join('\n'));