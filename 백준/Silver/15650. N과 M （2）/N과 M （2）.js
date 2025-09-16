const [N, M] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const arr = new Array(M);
const ans = [];
DFS(0, 1);
function DFS(depth, start) {
  if(depth === M) {
    ans.push([...arr]);
    return;
  }
  for(let i = start; i <= N; i++) {
    arr[depth] = i;
    DFS(depth + 1, i + 1);
  }
}
console.log(ans.map(line => line.join(' ')).join('\n'));