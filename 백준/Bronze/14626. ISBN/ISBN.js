const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('');
let isOne = true;
let sum = 0;
for(let i = 0; i < 12; i++) {
  if(input[i] === '*') isOne = i % 2 === 0;
  else sum += Number(input[i]) * (i % 2 === 0 ? 1 : 3);
}
for(let i = 0; i <= 9; i++) {
  if((sum + i * (isOne ? 1 : 3) + Number(input[12])) % 10 == 0) {
    console.log(i);
  }
}