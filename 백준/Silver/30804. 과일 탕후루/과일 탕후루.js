const [[N], arr] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim().split(' ').map(Number));
const map = new Map();
let left = 0;
let right = 0;
let max = 0;
while(right < N) {
  map.set(arr[right], (map.has(arr[right]) ? map.get(arr[right]) : 0) + 1);
  while(map.size > 2) {
    map.set(arr[left], map.get(arr[left]) - 1);
    if(map.get(arr[left]) === 0) map.delete(arr[left]);
    left++;
  }
  if(max < (right - left + 1)) max = right - left + 1;
  right++;
}
console.log(max);