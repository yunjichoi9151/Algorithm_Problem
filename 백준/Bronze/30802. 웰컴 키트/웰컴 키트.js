const [N, arr, [T, P]] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(num => num.split(' ').map(Number));
const cnt = arr.reduce((sum, num) => sum += Math.ceil(num / T), 0);
console.log(cnt);
console.log(`${Math.floor(N / P)} ${N % P}`);