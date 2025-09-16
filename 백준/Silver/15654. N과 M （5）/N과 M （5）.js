const [[N, M], arr] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
arr.sort((a, b) => a - b);
const visited = new Array(N).fill(false);
const tmp = new Array(M);
const ans = [];
DFS(0);
console.log(ans.map(line => line.join(' ')).join('\n'));
function DFS(depth) {
  if(depth === M) {
    ans.push([...tmp]);
    return;
  }
  for(let i = 0; i < N; i++) {
    if(visited[i]) continue;
    visited[i] = true;
    tmp[depth] = arr[i];
    DFS(depth + 1);
    visited[i] = false;
  }
}