const [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => Number(line.trim()));
if(N === 0) {
  console.log(0);
  return;
}
const del = Math.round(N * 0.15);
input.sort((a, b) => a - b);
let sum = 0;
for(let i = del; i < N - del; i++) {
  sum += input[i];
}
console.log(Math.round(sum / (N - del * 2)));