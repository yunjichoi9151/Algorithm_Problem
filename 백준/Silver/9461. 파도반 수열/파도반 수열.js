const [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => Number(line.trim()));
const arr = new Array(101);
arr[1] = arr[2] = arr[3] = 1;
arr[4] = arr[5] = 2;
const ans = [];
for(let i = 6; i <= 100; i++) {
  arr[i] = arr[i - 1] + arr[i - 5];
}
for(let i = 0; i < N; i++) {
  ans.push(arr[input[i]]);
}
console.log(ans.join('\n'));