const n = Number(require('fs').readFileSync('/dev/stdin').toString());
const input = [];
for(let i = 0; i < n; i++) {
  input[i] = '*'.repeat(i + 1);
}
console.log(input.join('\n').trim());
