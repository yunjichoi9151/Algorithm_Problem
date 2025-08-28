const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
if(N <= 3) {
  console.log(N);
  return;
}
const dp = [0, 1, 2, 3];
for(let i = 4; i <= N; i++) {
  let num = i;
  for(let j = 1; j * j <= i; j++) {
    if(j * j == i) {
      num = 1;
      break;
    }
    num = Math.min(num, dp[i - j * j] + 1);
  }
  dp.push(num);
}
console.log(dp[N]);