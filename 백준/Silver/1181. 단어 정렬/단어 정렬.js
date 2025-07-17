let [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
N = Number(N);
const set = new Set(input);
console.log([...set].sort((a, b) => {
  if(a.length !== b.length) {
    return a.length - b.length;
  } else {
    return a.localeCompare(b)
  }
}).join('\n').trim());