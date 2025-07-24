const [N, K] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const arr = Array(N).fill().map((_, i) => i + 1);
let now_idx = K - 1;
let answer = [];
for(let i = 0; i < N; i++) {
  answer.push(arr[now_idx]);
  arr.splice(now_idx, 1);
  if(i != N - 1) now_idx = (now_idx + K - 1) % arr.length;
}
console.log("<" + answer.join(", ") + ">");