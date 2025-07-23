let [N, input1, M, input2] = require('fs').readFileSync('/dev/stdin').toString().split('\n');
N = Number(N);
M = Number(M);
input1 = input1.trim().split(' ').map(Number);
input2 = input2.trim().split(' ').map(Number);
let map = new Map();
const ans = [];
for(let i = 0; i < N; i++) {
  map.set(input1[i], (map.has(input1[i]) ? map.get(input1[i]) : 0) + 1);
}
for(let i = 0; i < M; i++) {
  ans.push(map.has(input2[i]) ? map.get(input2[i]) : 0);
}
console.log(ans.join(' '));