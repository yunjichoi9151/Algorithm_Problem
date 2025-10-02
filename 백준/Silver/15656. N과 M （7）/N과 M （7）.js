const [[N, M], input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const arr = input.sort((a, b) => a - b);
const list = [];
const ans = [];
DFS(0);
console.log(ans.map(line => line.join(' ')).join('\n'));
function DFS(depth) {
  if(depth === M) {
    ans.push([...list]);
    return;
  }
  for(let i = 0; i < N; i++) {
    list.push(arr[i]);
    DFS(depth + 1);
    list.pop();
  }
}