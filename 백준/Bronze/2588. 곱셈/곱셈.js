var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
console.log(
  a * (b % 10) +
    '\n' +
    a * (Math.floor(b / 10) % 10) +
    '\n' +
    a * Math.floor(b / 100) +
    '\n' +
    a * b
);