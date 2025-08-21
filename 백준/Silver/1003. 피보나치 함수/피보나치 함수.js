const [T, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => Number(line.trim()));
const fib = Array.from({length : 41}, () => new Array(2));
fib[0] = [1, 0];
fib[1] = [0, 1];
for(let i = 2; i <= 40; i++) {
  fib[i][0] = fib[i - 1][0] + fib[i - 2][0];
  fib[i][1] = fib[i - 1][1] + fib[i - 2][1];
}
const ans = [];
for(let i = 0; i < T; i++) {
  const n = input[i];
  ans.push([fib[n][0], fib[n][1]]);
}
console.log(ans.map(line => line.join(' ')).join('\n'));