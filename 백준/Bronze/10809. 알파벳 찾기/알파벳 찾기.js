const input = require('fs').readFileSync('/dev/stdin').toString().trim();
const answer = new Array(26).fill(-1);
for(let i = 0; i < input.length; i++) {
  const n = input.charCodeAt(i) - 97;
  if(answer[n] === -1) answer[n] = i;
}
console.log(answer.join(' '));