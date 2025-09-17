let [N, arr] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
arr = arr.split(' ').map(Number);
const dp = new Array(N);
let max = 0;
for(let i = 0; i < N; i++) {
  dp[i] = 1;
  for(let j = 0; j < i; j++) {
    if(arr[j] < arr[i]) {
      dp[i] = Math.max(dp[j] + 1, dp[i]);
    }
  }
  if(dp[i] > max) max = dp[i];
}
console.log(max);