const [[N], arr] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim().split(' ').map(Number));
const tmp = [...new Set(arr)].sort((a, b) => a - b);
const map = new Map();
tmp.forEach((val, idx) => {map.set(val, idx)});
const ans = arr.map(val => map.get(val));
console.log(ans.join(' '));