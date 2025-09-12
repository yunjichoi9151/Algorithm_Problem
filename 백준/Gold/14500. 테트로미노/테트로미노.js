const [[N, M], ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const visited = Array.from({length : N}, () => new Array(M).fill(false));
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
let max = 0;
for(let i = 0; i < N; i++) {
  for(let j = 0; j < M; j++) {
    DFS(i, j, 1, map[i][j]);
    findT(i, j);
  }
}
console.log(max);

function DFS(x, y, depth, sum) {
  if(depth === 4) {
    if(max < sum) {
      max = sum;
    }
    return;
  }
  visited[x][y] = true;
  for(let i = 0; i < 4; i++) {
    const nx = x + dx[i];
    const ny = y + dy[i];
    if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny]) continue;
    DFS(nx, ny, depth + 1, sum + map[nx][ny]);
  }
  visited[x][y] = false;
}

function findT(x, y) {
  for(let i = 0; i < 4; i++) {
    let sum = map[x][y];
    let isOK = true;
    for(let j = 0; j < 4; j++) {
      if(i !== j) {
        const nx = x + dx[j];
        const ny = y + dy[j];
        if(nx < 0 || ny < 0 || nx >= N || ny >= M) {
          isOK = false;
          break;
        }
        sum += map[nx][ny];
      }
    }
    if(isOK && max < sum) max = sum;
  }
}