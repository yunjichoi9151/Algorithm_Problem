const [T, ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => Number(line.trim()));
const dp = new Array(11);
const ans = [];
dp[1] = 1;
dp[2] = 2;
dp[3] = 4;
for (let i = 4; i <= 10; i++) {
  dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
}
for (let i = 0; i < T; i++) {
  ans.push(dp[input[i]]);
}
console.log(ans.join("\n"));
