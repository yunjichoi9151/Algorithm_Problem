let [N, M, ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => line.trim());
N = Number(N);
M = Number(M);
input = input.map((line) => line.split(" ").map(Number));
const arr = Array.from({ length: N + 1 }, () => []);
for (let i = 0; i < M; i++) {
  const [a, b] = input[i];
  arr[a].push(b);
  arr[b].push(a);
}
const visited = new Array(N + 1).fill(false);
const queue = [1];
visited[1] = true;
let cnt = 0;
while (queue.length > 0) {
  const tmp = queue.shift();
  for (const num of arr[tmp]) {
    if (!visited[num]) {
      queue.push(num);
      visited[num] = true;
      cnt++;
    }
  }
}
console.log(cnt);
