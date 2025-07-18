const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
let count = 0;
let ans = 666;
while(true) {
  if(String(ans).includes('666')) {
    count++;
    if(count === N) {
      console.log(ans);
      break;
    }
  }
  ans++;
}