const [[N, M], ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const visited = Array.from({length : N}, () => new Array(M).fill(false));
let max = 0;
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
for(let i = 0; i < N; i++) {
  for(let j = 0; j < M; j++) {
    DFS(i, j, 1, map[i][j]);
    extraShape(i, j);
  }
}
console.log(max);

function DFS(x, y, depth, sum) {
  visited[x][y] = true;
  if(depth === 4) {
    max = Math.max(max, sum);
    visited[x][y] = false;
    return;
  }
  for(let i = 0; i < 4; i++) {
    const nx = x + dx[i];
    const ny = y + dy[i];
    if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny]) continue;
    DFS(nx, ny, depth + 1, sum + map[nx][ny]);
  }
  visited[x][y] = false;
}

function extraShape(x, y) {
  for(let i = 0; i < 4; i++) {
    let tmp = map[x][y];
    let isPossible = true;
    for(let j = 0; j < 4; j++) {
      if(i === j) continue;
      let nx = x + dx[j];
      let ny = y + dy[j];
      if(nx < 0 || ny < 0 || nx >= N || ny >= M) {
        isPossible = false;
        break;
      }
      tmp += map[nx][ny];
    }
    if(isPossible) max = Math.max(max, tmp);
  }
}