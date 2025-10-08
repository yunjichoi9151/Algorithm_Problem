const [[N, M], nums] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const path = new Array(M);
const ans = [];
nums.sort((a, b) => a - b);
DFS(0, 0);
console.log(ans.map(line => line.join(' ')).join('\n'));
function DFS(start, depth) {
  if(depth === M) {
    ans.push([...path]);
    return;
  }
  let before = Number.MIN_VALUE;
  for(let i = start; i < N; i++) {
    if(before === nums[i]) continue;
    path[depth] = nums[i];
    before = nums[i];
    DFS(i + 1, depth + 1);
  }
}