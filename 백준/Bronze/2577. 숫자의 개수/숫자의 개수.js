const [A, B, C] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(Number);
let arr = String(A * B * C).split('');
let cnt = new Array(10).fill(0);
for(let i = 0; i < arr.length; i++) {
  cnt[Number(arr[i])]++;
}
console.log(cnt.join('\n'));