let [n, ...arr] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
arr = arr[0].split(' ').map(Number).sort((a, b) => a - b);
console.log(arr[0] + ' ' + arr[arr.length - 1]);