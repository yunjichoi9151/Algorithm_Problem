const [N, S] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const mod = 1234567891;
let r = 1;
let answer = 0;
for(let i = 0; i < N; i++) {
  const num = S.charCodeAt(i) - 96;
  answer = (answer + num * r) % mod;
  r = r * 31 % mod;
}
console.log(answer);