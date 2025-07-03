const s = require('fs').readFileSync('/dev/stdin').toString().trim();
console.log(s === "" ? 0 : s.split(' ').length);