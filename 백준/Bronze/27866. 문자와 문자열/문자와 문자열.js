const [s, i] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
console.log(s[i - 1]);