const [[N, M], ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const map = Array.from({ length : N + 1 }, () => new Array(N + 1).fill(0));
const ans = [];
for(let i = 1; i <= N; i++) {
  for(let j = 1; j <= N; j++) {
    map[i][j] = map[i - 1][j] + map[i][j - 1] - map[i - 1][j - 1] + input[i - 1][j - 1];
  }
}
for(let i = N; i < N + M; i++) {
  const [x1, y1, x2, y2] = input[i];
  ans.push(map[x2][y2] - map[x1 - 1][y2] - map[x2][y1 - 1] + map[x1 - 1][y1 - 1]);
}
console.log(ans.join('\n'));