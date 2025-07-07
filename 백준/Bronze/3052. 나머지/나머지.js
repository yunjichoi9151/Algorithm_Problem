const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(Number).map(n => n % 42);
console.log([...new Set(input)].length);