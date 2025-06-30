const input = Number(require('fs').readFileSync('/dev/stdin'));
const answer = [];
for(let i = 1; i <= input; i++) {
  answer[i - 1] = i;
}
console.log(answer.join('\n'));