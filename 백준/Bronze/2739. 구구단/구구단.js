const input = Number(require('fs').readFileSync('/dev/stdin').toString());
const answer = [];
for(let i = 1; i <= 9; i++) {
  answer[i - 1] = input + ' * ' + i + " = " + (input * i);
}
console.log(answer.join('\n'));