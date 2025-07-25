const [M, N] = require('fs').readFileSync('/dev/stdin').toString().trim().split(" ").map(Number);
const isPrime = new Array(N + 1).fill(true);
isPrime[0] = isPrime[1] = false;
const ans = [];
for(let i = 2; i * i <= N; i++) {
  if(isPrime[i]) {
    for(let j = i * i; j <= N; j += i) {
      isPrime[j] = false;
    }
  }
}
for(let i = M; i <= N; i++) {
  if(isPrime[i]) ans.push(i);
}
console.log(ans.join('\n'));