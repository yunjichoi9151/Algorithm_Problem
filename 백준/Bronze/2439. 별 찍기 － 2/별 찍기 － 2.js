var fs = require('fs');
var n = fs.readFileSync('/dev/stdin').toString().trim();
for (var i = 0; i < n; i++) {
  var tmp = '';
  for (var j = 0; j < n; j++) {
    if (j < n - i - 1) {
      tmp += ' ';
    } else {
      tmp += '*';
    }
  }
  console.log(tmp);
}