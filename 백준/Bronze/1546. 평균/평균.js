let [N, input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
N = Number(N);
input = input.trim().split(' ').map(Number);
let sum = 0;
const max = input.reduce((a, max) => max = Math.max(max, a));
for(let num of input) {
  sum += num / max * 100;
}
console.log(sum / N);