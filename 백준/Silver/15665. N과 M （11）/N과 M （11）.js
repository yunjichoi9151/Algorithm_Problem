const [[N, M], nums] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const path = [];
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
    if(before === nums[i]) continue;
    path.push(nums[i]);
    before = nums[i];
    DFS(depth + 1);
    path.pop();
  }
}