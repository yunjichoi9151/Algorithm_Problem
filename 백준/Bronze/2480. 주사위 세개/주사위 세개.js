var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
var c = parseInt(input[2]);
if (a == b && b == c) {
  console.log(10000 + a * 1000);
} else if (a == b || b == c || c == a) {
  if (a == b || b == c) {
    console.log(1000 + b * 100);
  } else {
    console.log(1000 + c * 100);
  }
} else {
  if (a > b && a > c) {
    console.log(a * 100);
  } else if (b > a && b > c) {
    console.log(b * 100);
  } else {
    console.log(c * 100);
  }
}