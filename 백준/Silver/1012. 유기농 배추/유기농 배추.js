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
    return this.head === this.arr.length;
  }
}

let [T, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
T = Number(T);
let idx = 0;
const ans = [];
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
for(let tc = 0; tc < T; tc++) {
  const [M, N, K] = input[idx++].split(' ').map(Number);
  const map = Array.from({length : N}, () => new Array(M).fill(false));
  const visited = Array.from({length : N}, () => new Array(M).fill(false));
  for(let i = 1; i <= K; i++) {
    const [x, y] = input[idx++].split(' ').map(Number);
    map[y][x] = true;
  }
  let cnt = 0;
  for(let i = 0; i < N; i++) {
    for(let j = 0; j < M; j++) {
      if(map[i][j] && !visited[i][j]) {
        const que = new Queue();
        que.add({x : i, y : j});
        visited[i][j] = true;
        while(!que.isEmpty()) {
          const tmp = que.poll();
          for(let k = 0; k < 4; k++) {
            const nx = tmp.x + dx[k];
            const ny = tmp.y + dy[k];
            if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || !map[nx][ny]) continue;
            que.add({x : nx, y : ny});
            visited[nx][ny] = true;
          }
        }
        cnt++;
      }
    }
  }
  ans.push(cnt);
}
console.log(ans.join('\n'));