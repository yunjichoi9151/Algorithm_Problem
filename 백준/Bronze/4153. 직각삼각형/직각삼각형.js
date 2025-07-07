const arr = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(s => s.trim().split(' ').sort((a, b) => a - b));
const answer = [];
for(let i = 0; i < arr.length; i++) {
  if(arr[i].join(' ') === '0 0 0') break;
  answer.push(Math.pow(arr[i][2], 2) === (Math.pow(arr[i][0], 2) + Math.pow(arr[i][1], 2)) ? 'right' : 'wrong');
}
console.log(answer.join('\n'));