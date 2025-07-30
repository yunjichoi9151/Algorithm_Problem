const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
const arr = new Array(N + 1).fill(0);
for(let i = 2; i <= N; i++) {
  arr[i] = arr[i - 1] + 1;
  if(i % 2 == 0) arr[i] = Math.min(arr[i], arr[i / 2] + 1);
  if(i % 3 == 0) arr[i] = Math.min(arr[i], arr[i / 3] + 1);
}
console.log(arr[N]);