const [[N, M], tree] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim().split(' ').map(Number));
let left = right = 0;
for(let i = 0; i < N; i++) {
  if(tree[i] > right) right = tree[i];
}
let ans = 0;
while(left <= right) {
  let mid = Math.floor((left + right) / 2);
  let sum = 0;
  for(let i = 0; i < N; i++) {
    sum += Math.max(tree[i] - mid, 0);
    if(sum >= M) break;
  }
  if(sum >= M) {
    ans = mid;
    left = mid + 1;
  } else {
    right = mid - 1;
  }
}
console.log(ans);