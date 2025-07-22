const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
const num = Math.floor(N / 5);
for(let i = num; i >= 0; i--) {
  if((N - i * 5) % 3 === 0) {
    console.log(i + ((N - i * 5) / 3));
    return;
  }
}
console.log(-1);