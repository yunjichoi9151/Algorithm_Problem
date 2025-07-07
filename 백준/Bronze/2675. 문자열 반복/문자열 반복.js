let [T, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
T = Number(T);
const answer = [];
for(let i = 0; i < T; i++) {
  const [N, S] = input[i].split(' ');
  const num = Number(N);
  answer.push(S.split('').map(c => c.repeat(num)).join(''));
}
console.log(answer.join('\n'));