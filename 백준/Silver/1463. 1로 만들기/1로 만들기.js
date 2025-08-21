const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
const dp = new Array(N + 1).fill(0);
for(let i = 2; i <= N; i++) {
  let num = dp[i - 1] + 1;
  if(i % 3 === 0) num = Math.min(num, dp[i / 3] + 1);
  if(i % 2 === 0) num = Math.min(num, dp[i / 2] + 1);
  dp[i] = num;
}
console.log(dp[N]);