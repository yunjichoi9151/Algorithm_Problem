const N = Number(require("fs").readFileSync("/dev/stdin").toString().trim());
if (N === 1) {
  console.log(1);
  return;
}
const dp = new Array(N + 1);
dp[0] = 0;
dp[1] = 1;
for (let i = 2; i <= N; i++) {
  dp[i] = i;
  for (let j = 1; j * j <= i; j++) {
    dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
  }
}
console.log(dp[N]);
