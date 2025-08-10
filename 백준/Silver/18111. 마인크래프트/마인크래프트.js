const [[N, M, B], ...map] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => line.trim().split(" ").map(Number));
let min = 257;
let max = 0;
const ans = [Number.MAX_VALUE, 0];
for (let i = 0; i < N; i++) {
  for (let j = 0; j < M; j++) {
    if (min > map[i][j]) min = map[i][j];
    if (max < map[i][j]) max = map[i][j];
  }
}
for (let x = max; x >= min; x--) {
  let cnt = B;
  let time = 0;
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      if (x > map[i][j]) {
        cnt -= x - map[i][j];
        time += x - map[i][j];
      } else if (x < map[i][j]) {
        cnt += map[i][j] - x;
        time += 2 * (map[i][j] - x);
      }
    }
  }
  if (cnt >= 0 && time < ans[0]) {
    ans[0] = time;
    ans[1] = x;
  }
}
console.log(ans.join(" "));
