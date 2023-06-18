var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
var sum = 0;
for (var i = 1; i <= input; i++) {
  sum += i;
}
console.log(sum);