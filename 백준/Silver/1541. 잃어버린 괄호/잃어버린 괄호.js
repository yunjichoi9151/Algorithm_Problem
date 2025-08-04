function calculate(S) {
  const arr = S.split('+').map(Number);
  let tmp = 0;
  for(let num of arr) {
    tmp += num;
  }
  return tmp;
}
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('-');
let sum = 0;
sum += calculate(input[0]);
for(let i = 1; i < input.length; i++) {
  sum -= calculate(input[i]);
}
console.log(sum);