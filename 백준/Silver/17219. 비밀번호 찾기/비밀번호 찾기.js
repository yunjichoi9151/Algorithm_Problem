const [input0, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
const [N, M] = input0.split(' ').map(Number);
const map = new Map();
const ans = [];
for(let i = 0; i < N; i++) {
  const line = input[i].split(' ');
  map.set(line[0], line[1]);
}
for(let i = N; i < N + M; i++) {
  ans.push(map.get(input[i]));
}
console.log(ans.join('\n'));