let [T, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(S => S.trim());
T = Number(T);
const answer = [];
for(let tc = 0; tc < T; tc++) {
  let cnt = 0;
  let ans = 0;
  for(let i = 0; i < input[tc].length; i++) {
    if(input[tc][i] === 'O') ans += ++cnt;
    else cnt = 0;
  }
  answer.push(ans);
}
console.log(answer.join('\n'));