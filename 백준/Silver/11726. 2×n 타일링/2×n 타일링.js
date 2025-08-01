const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
if(N == 1) {
  console.log(1);
  return;
}
const arr = new Array(N + 1);
arr[0] = 0;
arr[1] = 1;
arr[2] = 2;
for(let i = 3; i <= N; i++) {
  arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
}
console.log(arr[N]);