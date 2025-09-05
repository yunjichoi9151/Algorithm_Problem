let [N, input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
input = input.split(' ').map(Number);
const map = new Map();
let left = 0;
let ans = 0;
for(let right = 0; right < N; right++) {
  map.set(input[right], (map.has(input[right]) ? map.get(input[right]) : 0) + 1);
  while(map.size > 2) {
    const tmp = input[left++];
    const tmp_cnt = map.get(tmp) - 1;
    if(tmp_cnt === 0) map.delete(tmp);
    else map.set(tmp, tmp_cnt);
  }
  ans = Math.max(ans, right - left + 1);
}
console.log(ans);