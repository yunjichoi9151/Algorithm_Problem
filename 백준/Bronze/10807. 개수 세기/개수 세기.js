var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const [n, s, v] = input;
const ans = s.split(' ').filter((i) => i == v).length;
console.log(ans);