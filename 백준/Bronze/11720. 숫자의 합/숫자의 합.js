let [n, input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
console.log(input.split('').reduce((a, b) => a + Number(b), 0));