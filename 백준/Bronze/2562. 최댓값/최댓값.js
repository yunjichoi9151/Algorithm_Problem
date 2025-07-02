const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);
let [max, idx] = [-1, -1];
for(let i = 0; i < 9; i++) {
  if(input[i] > max) {
    max = input[i];
    idx = i + 1;
  }
}
console.log(max + '\n' + idx);