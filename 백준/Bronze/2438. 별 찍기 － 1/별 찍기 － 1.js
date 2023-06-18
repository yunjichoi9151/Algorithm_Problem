var fs = require('fs');
var n = fs.readFileSync('/dev/stdin').toString().trim();
for (var i = 0; i < n; i++) {
  var tmp = '';
  for (var j = 0; j <= i; j++) {
    tmp += '*';
  }
  console.log(tmp);
}