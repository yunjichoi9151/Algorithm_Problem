class Queue {
  constructor() {
    this.arr = [];
    this.head = 0;
  }

  add(num) {
    this.arr.push(num);
  }

  poll() {
    return this.arr[this.head++];
  }

  isEmpty() {
    return this.head >= this.arr.length;
  }
}

const [[N, M], ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map((line) => line.trim().split(" ").map(Number));
const map = Array.from({ length: 101 }, (v, i) => i);
for (let i = 0; i < N + M; i++) {
  map[input[i][0]] = input[i][1];
}
const que = new Queue();
const visited = new Array(101).fill(false);
que.add({ x: 1, cnt: 0 });
visited[1] = true;
while (!que.isEmpty()) {
  const node = que.poll();
  if (node.x === 100) {
    console.log(node.cnt);
    return;
  }
  for (let i = 1; i <= 6; i++) {
    let nx = node.x + i;
    if (nx > 100) continue;
    nx = map[nx];
    if (!visited[nx]) {
      que.add({ x: nx, cnt: node.cnt + 1 });
      visited[nx] = true;
    }
  }
}
