let [input, ...input2] = require('fs').readFileSync('/dev/stdin').toString().split('\n');
let [N, K] = input.split(' ').map(Number);
input2 = input2.map(Number);
let cnt = 0;
for(let i = N - 1; i >= 0; i--) {
  cnt += Math.floor(K / input2[i]);
  K %= input2[i];
}
console.log(cnt);