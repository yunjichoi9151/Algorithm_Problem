let [T, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
T = Number(T);
const answer = [];
let idx = 0;
for(let tc = 0; tc < T; tc++) {
  const K = input[idx++];
  const N = input[idx++];
  const arr = Array.from({ length: K + 1 }, () => Array(N).fill(1));
  for(let i = 0; i < N; i++) {
    arr[0][i] = i + 1;
  }
  for(let i = 1; i <= K; i++) {
    for(let j = 1; j < N; j++) {
      arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
    }
  }
  answer.push(arr[K][N - 1]);
}
console.log(answer.join('\n'));