class Queue {
  constructor() {
    this.arr = [];
  }

  add(a, b) {
    this.arr.push({ x: a, y: b });
  }

  poll() {
    return this.arr.shift();
  }

  isEmpty() {
    return this.arr.length === 0;
  }
}

const input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => line.trim());
const T = input.splice(0, 1);
const ans = [];
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
for (let tc = 0; tc < T; tc++) {
  const [M, N, K] = input.splice(0, 1)[0].split(" ").map(Number);
  const arr = input.splice(0, K);
  const map = new Array(N).fill(0).map(() => new Array(M).fill(false));
  const visited = new Array(N).fill(0).map(() => new Array(M).fill(false));
  const que = new Queue();
  let cnt = 0;
  for (let i = 0; i < K; i++) {
    const [x, y] = arr[i].split(" ").map(Number);
    map[y][x] = true;
  }
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      if (map[i][j] && !visited[i][j]) {
        que.add(i, j);
        visited[i][j] = true;
        cnt++;
        while (!que.isEmpty()) {
          const node = que.poll();
          for (let k = 0; k < 4; k++) {
            const nx = node.x + dx[k];
            const ny = node.y + dy[k];
            if (nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny])
              continue;
            if (map[nx][ny]) {
              que.add(nx, ny);
              visited[nx][ny] = true;
            }
          }
        }
      }
    }
  }
  ans.push(cnt);
}
console.log(ans.join("\n"));
