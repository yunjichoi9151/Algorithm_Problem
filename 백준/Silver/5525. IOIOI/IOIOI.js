let [N, M, S] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
M = Number(M);
let ans = 0;
let i = 0;
while(i < M - 1) {
  if(S[i] === 'I') {
    let cnt = 0;
    while(i + 2 < M && S[i + 1] === 'O' && S[i + 2] === 'I') {
      cnt++;
      if(cnt === N) {
        ans++;
        cnt--;
      }
      i += 2;
    }
    i++;
  } else {
    i++;
  }
}
console.log(ans);