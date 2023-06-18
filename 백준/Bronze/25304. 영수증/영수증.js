var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
var x = parseInt(input[0]);
var n = parseInt(input[1]);
var sum = 0;
for (var i = 0; i < n; i++) {
  sum +=
    parseInt(input[i + 2].split(' ')[0]) * parseInt(input[i + 2].split(' ')[1]);
}
if (x == sum) {
  console.log('Yes');
} else {
  console.log('No');
}