let [N, input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
input = input.split(' ').map(Number);
input.sort((a, b) => a - b);
let sum = input[0];
for(let i = 1; i < N; i++) {
  input[i] += input[i - 1];
  sum += input[i];
}
console.log(sum);