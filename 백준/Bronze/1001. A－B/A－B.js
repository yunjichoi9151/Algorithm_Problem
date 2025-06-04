const arr = require("fs").readFileSync("/dev/stdin").toString().trim().split(" ").map(Number);
console.log(arr[0] - arr[1]);