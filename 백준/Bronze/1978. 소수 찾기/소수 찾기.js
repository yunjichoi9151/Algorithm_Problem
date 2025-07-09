let [N, input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
N = Number(N)
input = input.split(' ').map(Number);
let answer = 0;
for(let i = 0; i < N; i++) {
  if(input[i] === 1) continue;
  let isTrue = true;
  for(let j = 2; j <= input[i] / j; j++) {
    if(input[i] % j === 0) {
      isTrue = false;
      break;
    }
  }
  if(isTrue) answer++;
}
console.log(answer);