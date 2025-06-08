const [line1, line2] = require("fs").readFileSync("/dev/stdin").toString().trim().split("\n");
const arr = line2.split(' ').map(Number);
console.log(Math.min(...arr), Math.max(...arr));