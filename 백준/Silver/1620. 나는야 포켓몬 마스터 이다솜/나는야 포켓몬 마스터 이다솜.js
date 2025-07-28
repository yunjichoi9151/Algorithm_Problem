let [input1, ...input2] = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const [N, M] = input1.trim().split(' ').map(Number);
const arr = new Array(N + 1);
const nameMap = new Map();
const ans = [];
for(let i = 0; i < N; i++) {
  const name = input2[i].trim();
  arr[i + 1] = name;
  nameMap.set(name, i + 1);
}
for(let i = 0; i < M; i++) {
  let str = input2[N + i].trim();
  if(!isNaN(str) && str !== '') ans.push(arr[Number(str)]);
  else ans.push(nameMap.get(str));
}
console.log(ans.join('\n'));