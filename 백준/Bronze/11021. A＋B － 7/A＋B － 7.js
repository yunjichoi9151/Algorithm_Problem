var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
var t = parseInt(input[0]);
for (var i = 1; i <= t; i++) {
  console.log(
    'Case #' +
      i +
      ': ' +
      (parseInt(input[i].split(' ')[0]) + parseInt(input[i].split(' ')[1]))
  );
}