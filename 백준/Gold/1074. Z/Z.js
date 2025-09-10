let [N, r, c] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
let ans = 0;
while(N > 0) {
  const half = 1 << (N - 1);
  const where = (r >= half ? 2 : 0) + (c >= half ? 1 : 0);
  ans += half * half * where;
  if(r >= half) r -= half;
  if(c >= half) c -= half;
  N--;
}
console.log(ans);