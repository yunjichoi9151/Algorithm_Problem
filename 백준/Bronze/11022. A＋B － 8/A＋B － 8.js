var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
var t = parseInt(input[0]);
for (var i = 1; i <= t; i++) {
  var a = parseInt(input[i].split(' ')[0]);
  var b = parseInt(input[i].split(' ')[1]);
  console.log('Case #' + i + ': ' + a + ' + ' + b + ' = ' + (a + b));
}