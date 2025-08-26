const [T, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => Number(line.trim()));
const ans = [];
for(let tc = 0; tc < T; tc++) {
  let N = input[tc];
  if(N <= 2) {
    ans.push(N);
    continue;
  }
  const dp = [0, 1, 2, 4];
  for(let i = 4; i <= N; i++) {
    dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
  }
  ans.push(dp[N]);
}
console.log(ans.join('\n'));