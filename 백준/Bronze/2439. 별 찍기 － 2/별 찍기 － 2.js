const N = Number(require('fs').readFileSync('/dev/stdin').toString());
const result = [];
for(let i = 1; i <= N; i++) {
  result[i - 1] = ' '.repeat(N - i) + '*'.repeat(i);
}
console.log(result.join('\n'));