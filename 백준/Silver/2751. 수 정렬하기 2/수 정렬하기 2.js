const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

const n = +input[0];
const arr = new Array(n);

for (let i = 0; i < n; i++) {
  arr[i] = +input[i + 1];
}

arr.sort((a, b) => a - b);

process.stdout.write(arr.join('\n'));
