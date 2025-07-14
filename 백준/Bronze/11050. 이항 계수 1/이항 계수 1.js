let [N, K] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
K = Math.min(K, N - K);
let ans = 1;
for(let i = N; i > N - K; i--) {
  ans *= i;
}
for(let i = 1; i <= K; i++) {
  ans /= i;
}
console.log(ans);