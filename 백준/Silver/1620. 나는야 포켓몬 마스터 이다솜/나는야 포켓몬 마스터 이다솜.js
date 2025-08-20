let [input0, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
const [N, M] = input0.split(' ').map(Number);
const arr = new Array(N + 1);
const map = new Map();
const ans = [];
for(let i = 1; i <= N; i++) {
  arr[i] = input[i - 1];
  map.set(input[i - 1], i);
}
for(let i = N; i < N + M; i++) {
  const now = input[i];
  if(now[0] >= '0' && now[0] <= '9') {
    ans.push(arr[Number(now)]);
  } else {
    ans.push(map.get(now));
  }
}
console.log(ans.join('\n'));