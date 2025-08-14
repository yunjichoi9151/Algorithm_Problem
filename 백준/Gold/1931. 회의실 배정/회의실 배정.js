let [N, ...arr] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
arr = arr.map(line => line.split(' ').map(Number));
arr.sort((o1, o2) => {
  if(o1[1] === o2[1]) {
    return o1[0] - o2[0];
  } else {
    return o1[1] - o2[1];
  }
})
let end = 0;
let cnt = 0;
for(let i = 0; i < N; i++) {
  if(arr[i][0] >= end) {
    end = arr[i][1];
    cnt++;
  }
}
console.log(cnt);