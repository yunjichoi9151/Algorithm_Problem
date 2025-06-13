const [a, b] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ');
const reverseNumber = s => +[...s].reverse().join('');
console.log(Math.max(reverseNumber(a), reverseNumber(b)));