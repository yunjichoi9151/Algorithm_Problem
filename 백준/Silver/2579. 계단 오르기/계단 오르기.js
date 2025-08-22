const [N, ...score] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => Number(line.trim()));
if(N === 1) {
  console.log(score[0]);
  return;
}
const dp = new Array(N + 1).fill(0);
dp[1] = score[0];
dp[2] = score[0] + score[1];
for(let i = 3; i <= N; i++) {
  dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 2]) + score[i - 1];

}
console.log(dp[N]);