var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');
var h = parseInt(input[0]);
var m = parseInt(input[1]);
var allTime = h * 60 + m;
if (allTime >= 45) {
  allTime -= 45;
  console.log(Math.floor(allTime / 60) + ' ' + (allTime % 60));
} else {
  allTime += 24 * 60 - 45;
  console.log(Math.floor(allTime / 60) + ' ' + (allTime % 60));
}