let [input, ...input2] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const [N, M] = input.split(" ").map(Number);
const cntSet = new Set();
let ans = [];
for(let i = 0; i < N; i++) {
  cntSet.add(input2[i].trim());
}
for(let i = 0; i < M; i++) {
  const name = input2[i + N].trim();
  if(cntSet.has(name)) ans.push(name);
}
console.log(ans.length);
console.log(ans.sort().join('\n'))