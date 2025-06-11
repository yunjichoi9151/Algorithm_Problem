const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const n = Number(input[0]);
const ans = input.slice(1, n + 1).map(line => {
  const [num, str] = line.trim().split(' ');
  return str.split('').map(ch => ch.repeat(Number(num))).join('');
});

console.log(ans.join('\n'));