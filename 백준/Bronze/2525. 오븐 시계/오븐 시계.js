var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
var a = parseInt(input[0].split(' ')[0]);
var b = parseInt(input[0].split(' ')[1]);
var c = parseInt(input[1]);
var endTime = a * 60 + b + c;
if (endTime < 24 * 60) {
  console.log(Math.floor(endTime / 60) + ' ' + (endTime % 60));
} else {
  endTime -= 24 * 60;
  console.log(Math.floor(endTime / 60) + ' ' + (endTime % 60));
}