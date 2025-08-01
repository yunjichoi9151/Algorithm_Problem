const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
if(N == 1) {
  console.log(1);
  return;
}
const dp = new Array(N + 1);
dp[0] = 0;
dp[1] = 1;
dp[2] = 3;
for(let i = 3; i <= N; i++) {
  dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
}
console.log(dp[N]);