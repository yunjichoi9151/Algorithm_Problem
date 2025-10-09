let [N, ...arr] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
arr = arr.map(line => line.split(' ').map(Number));
for(let i = 1; i < N; i++) {
  arr[i][0] += Math.min(arr[i - 1][1], arr[i - 1][2]);
  arr[i][1] += Math.min(arr[i - 1][0], arr[i - 1][2]);
  arr[i][2] += Math.min(arr[i - 1][0], arr[i - 1][1]);
}
console.log(Math.min(arr[N - 1][0], Math.min(arr[N - 1][1], arr[N - 1][2])));