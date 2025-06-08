const arr = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);
const max = Math.max(...arr);
console.log(max + '\n' + (arr.indexOf(max) + 1)); 