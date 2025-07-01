const year = require('fs').readFileSync('/dev/stdin').toString();
console.log((year % 400 === 0 || (year % 4 === 0 && year % 100 !== 0)) ? 1 : 0)