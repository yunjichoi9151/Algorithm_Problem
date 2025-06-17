const input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n')
  .map(Number);

const n = input[0];
const arr = input.slice(1, n + 1);

arr.sort((a, b) => a - b);

console.log(arr.join('\n'));