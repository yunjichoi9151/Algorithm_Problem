const [h, m] = require('fs').readFileSync('/dev/stdin').toString().split(' ').map(Number);
let num = h * 60 + m;
if(num < 45) num += 24 * 60;
num -= 45;
console.log(Math.floor(num / 60) + " " + num % 60);