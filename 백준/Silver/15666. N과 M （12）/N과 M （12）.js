const [[N, M], nums] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const path = [];
const ans = [];
nums.sort((a, b) => a - b);
DFS(0, 0);
console.log(ans.map(line => line.join(' ')).join('\n'));
function DFS(start, depth) {
  if(depth === M) {
    ans.push([...path]);
    return;
  }
  for(let i = start; i < N; i++) {
    if(i > start && nums[i] === nums[i - 1]) continue;
    path[depth] = nums[i];
    DFS(i, depth + 1);
  }
}