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

let [N, ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
map = map.map(line => line.split('').map(Number));
const visited = Array.from({length : N}, () => new Array(N).fill(false));
const ans = [];
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
for(let i = 0; i < N; i++) {
  for(let j = 0; j < N; j++) {
    if(map[i][j] === 1 && !visited[i][j]) {
      ans.push(BFS(i, j));
    }
  }
}
ans.sort((a, b) => a - b);
console.log(ans.length);
console.log(ans.join('\n'));

function BFS(x, y) {
  const que = new Queue();
  que.add({x : x, y : y});
  visited[x][y] = true;
  let cnt = 1;
  while(!que.isEmpty()) {
    const node = que.poll();
    for(let i = 0; i < 4; i++) {
      const nx = node.x + dx[i];
      const ny = node.y + dy[i];
      if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny] || map[nx][ny] === 0) continue;
      que.add({x : nx, y : ny});
      visited[nx][ny] = true;
      cnt++;
    }
  }
  return cnt;
}