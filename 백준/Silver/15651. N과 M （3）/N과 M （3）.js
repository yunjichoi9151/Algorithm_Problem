const [N, M] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const list = [];
const ans = [];
DFS(0);
console.log(ans.map(line => line.join(' ')).join('\n'));
function DFS(depth) {
  if(depth === M) {
    ans.push([...list]);
    return;
  }
  for(let i = 1; i <= N; i++) {
    list.push(i);
    DFS(depth + 1);
    list.pop();
  }
}