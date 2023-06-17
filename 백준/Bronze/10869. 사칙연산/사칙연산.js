var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
console.log(
  a +
    b +
    '\n' +
    (a - b) +
    '\n' +
    a * b +
    '\n' +
    (a - (a % b)) / b +
    '\n' +
    (a % b) +
    '\n'
);