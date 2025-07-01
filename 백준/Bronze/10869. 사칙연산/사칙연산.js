const [a, b] = require('fs').readFileSync('/dev/stdin').toString().split(' ').map(Number);
console.log((a + b) + '\n' + (a - b) + '\n' + (a * b) + '\n' + (Math.floor(a / b)) + '\n' + (a % b));