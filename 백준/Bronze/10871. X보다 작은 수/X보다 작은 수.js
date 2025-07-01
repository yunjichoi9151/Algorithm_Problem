const [head, line] = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const [n, x] = head.split(' ').map(Number);
console.log(line.split(' ').map(Number).filter(num => num < x).join(' '));