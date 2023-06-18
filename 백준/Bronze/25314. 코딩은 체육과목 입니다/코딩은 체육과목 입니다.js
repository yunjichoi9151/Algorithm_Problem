var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim();
var answer = '';
for (var i = 0; i < input / 4; i++) {
  answer += 'long ';
}
console.log(answer + 'int');