let [N, input] = require('fs').readFileSync('/dev/stdin').toString().split('\n');
N = Number(N.trim());
input = input.split(' ').map(line => Number(line.trim()));
const arr = [];
for(let i = 0; i < N; i++) {
  arr.push([i + 1, input[i]]);
}
arr.sort((a, b) => a[1] - b[1]);
let cnt = 0;
let sum = 0;
for(let i = 0; i < N; i++) {
  cnt += arr[i][1];
  sum += cnt;
}
console.log(sum);