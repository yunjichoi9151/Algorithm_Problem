const input = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
const answer = [];
for(let str of input) {
  if(str === '0') break;
  if(str === str.split('').reverse().join('')) answer.push('yes');
  else answer.push('no');
}
console.log(answer.join('\n'));