const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
let count = 0;
for(let i = 5; i <= N; i *= 5) {
  count += Math.floor(N / i);
}
console.log(count);