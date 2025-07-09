const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
const min = N - N.toString().length * 9
for(let i = min; i <= N; i++) {
  let sum = i;
  let tmp = i;
  while(tmp > 0) {
    sum += tmp % 10;
    tmp = Math.floor(tmp / 10);
  }
  if(sum === N) {
    console.log(i);
    return;
  }
}
console.log(0);