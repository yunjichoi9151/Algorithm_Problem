let [input0, ...input1] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
const [K, N] = input0.split(' ').map(Number);
input1 = input1.map(Number);
let left = 1;
let right = 0;
let result = 0;
for(let i = 0; i < input1.length; i++) {
  right = Math.max(right, input1[i]);
}
while(left <= right) {
  let mid = Math.floor((left + right) / 2);
  let cnt = 0;
  for(let i = 0; i < input1.length; i++) {
    cnt += Math.floor(input1[i] / mid);
  }
  if(cnt >= N) {
    result = mid;
    left = mid + 1;
  } else {
    right = mid - 1;
  }
}
console.log(result);