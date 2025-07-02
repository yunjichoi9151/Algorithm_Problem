const [A, B, C] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
console.log((Number(A) + Number(B) - Number(C)) + "\n" + (A + B - C));