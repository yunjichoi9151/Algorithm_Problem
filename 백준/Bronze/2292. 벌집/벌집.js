const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
let sum = 1;
let cnt = 1;
while(sum < N) {
  sum += 6 * cnt;
  cnt++;
}
console.log(cnt);