const [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => Number(line.trim()));
const arr = new Array(41);
arr[0] = [1, 0];
arr[1] = [0, 1];
const ans = [];
for(let i = 2; i <= 40; i++) {
  arr[i] = [arr[i - 1][0] + arr[i - 2][0], arr[i - 1][1] + arr[i - 2][1]];
}
for(let i = 0; i < N; i++) {
  ans.push([arr[input[i]][0], arr[input[i]][1]]);
}
console.log(ans.map(line => line.join(' ')).join('\n'));