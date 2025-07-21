let [N, arr, M, input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
M = Number(M);
arr = arr.split(' ').map(Number).sort((a, b) => a - b);
input = input.split(' ').map(Number);
const ans = [];
for(let i = 0; i < input.length; i++) {
  ans.push(binarySearch(input[i]) ? 1 : 0);
}
console.log(ans.join('\n'));

function binarySearch(target) {
  let left = 0;
  let right = N - 1;
  while(left <= right) {
    let mid = Math.floor((left + right) / 2);
    if(arr[mid] === target) return true;
    else if(arr[mid] > target) right = mid - 1;
    else left = mid + 1;
  }
  return false;
}