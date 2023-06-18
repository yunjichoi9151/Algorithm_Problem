var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
for (var i = 0; i < input.length; i++) {
  var a = parseInt(input[i].split(' ')[0]);
  var b = parseInt(input[i].split(' ')[1]);
  if (a == 0 && b == 0) {
    break;
  } else {
    console.log(a + b);
  }
}