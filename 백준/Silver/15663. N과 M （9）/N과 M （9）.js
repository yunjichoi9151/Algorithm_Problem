const [[N, M], nums] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.split(' ').map(Number));
const path = [];
const visited = new Array(N).fill(false);
const ans = [];
nums.sort((a, b) => a - b);
DFS(0);
console.log(ans.map(line => line.join(' ')).join('\n'));
function DFS(depth) {
  if(depth === M) {
    ans.push([...path]);
    return;
  }
  let before = Number.MIN_VALUE;
  for(let i = 0; i < N; i++) {
    if(visited[i]) continue;
    if(nums[i] === before) continue;
    visited[i] = true;
    path[depth] = nums[i];
    before = nums[i];
    DFS(depth + 1);
    visited[i] = false;
  }
}