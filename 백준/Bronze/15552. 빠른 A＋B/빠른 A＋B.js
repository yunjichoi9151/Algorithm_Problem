var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
var t = parseInt(input[0]);
var ans = '';
for (var i = 0; i < t; i++) {
  ans +=
    parseInt(input[i + 1].split(' ')[0]) +
    parseInt(input[i + 1].split(' ')[1]) +
    (i != t - 1 ? '\n' : '');
}
console.log(ans);