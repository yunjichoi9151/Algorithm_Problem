var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
var c = parseInt(input[2]);
console.log(
  ((a + b) % c) +
    '\n' +
    (((a % c) + (b % c)) % c) +
    '\n' +
    ((a * b) % c) +
    '\n' +
    (((a % c) * (b % c)) % c)
);