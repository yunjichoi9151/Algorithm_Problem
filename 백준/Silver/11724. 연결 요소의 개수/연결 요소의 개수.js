const [[N, M], ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => line.trim().split(" ").map(Number));
const list = Array.from({ length: N + 1 }, () => []);
const visited = new Array(N + 1).fill(false);
let ans = 0;
for (let i = 0; i < M; i++) {
  list[input[i][0]].push(input[i][1]);
  list[input[i][1]].push(input[i][0]);
}
for (let i = 1; i <= N; i++) {
  if (!visited[i]) {
    DFS(i);
    ans++;
  }
}
console.log(ans);

function DFS(num) {
  visited[num] = true;
  for (let i of list[num]) {
    if (!visited[i]) {
      DFS(i);
    }
  }
}
