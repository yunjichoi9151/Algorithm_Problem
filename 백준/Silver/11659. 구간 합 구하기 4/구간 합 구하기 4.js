const input = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
const [N, M] = input[0].split(' ').map(Number);
input[1] = input[1].split(' ').map(Number);
const arr = new Array(N + 1).fill(0);
const ans = [];
for(let i = 1; i <= N; i++) {
  arr[i] = arr[i - 1] + input[1][i - 1];
}
for(let i = 0; i < M; i++) {
  const [a, b] = input[i + 2].split(' ').map(Number);
  ans.push(arr[b] - arr[a - 1]);
}
console.log(ans.join('\n'));