let [N, r, c] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
let half = Math.floor(Math.pow(2, N) / 2);
let ans = 0;
while(half > 0) {
  ans += ((r < half ? 0 : 2) + (c < half ? 0 : 1)) * (half * half);
  if(r >= half) r -= half;
  if(c >= half) c -= half;
  half = Math.floor(half / 2);
}
console.log(ans);