const [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => Number(line.trim()));
const arr = new Array(2000001).fill(false);
const answer = [];
for(let i = 0; i < N; i++) {
  arr[input[i] + 1000000] = true;
}
for(let i = 0; i <= 2000000; i++) {
  if(arr[i]) answer.push(i - 1000000);
}
console.log(answer.join('\n'));