const [input, ...input2] = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const [N, M] = input.trim().split(' ').map(Number);
const passMap = new Map();
const ans = [];
for(let i = 0; i < N; i++) {
  const [site, password] = input2[i].split(' ');
  passMap.set(site, password);
}
for(let i = N; i < N + M; i++) {
  ans.push(passMap.get(input2[i].trim()));
}
console.log(ans.join('\n'));