const [n, ...arr] = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const answer = [];
for(let i = 0; i < n; i++) {
  arr[i] = arr[i].trim().split(' ').map(Number);
  if(arr[i][2] % arr[i][0] === 0) answer.push(arr[i][0] * 100 + Math.floor(arr[i][2] / arr[i][0]));
  else answer.push((arr[i][2] % arr[i][0]) * 100 + Math.floor(arr[i][2] / arr[i][0]) + 1);
}
console.log(answer.join('\n'));