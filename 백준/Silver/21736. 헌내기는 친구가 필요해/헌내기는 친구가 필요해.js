class Queue {
  constructor() {
    this.arr = [];
  }

  add(num) {
    this.arr.push(num);
  }

  poll() {
    return this.arr.shift();
  }

  size() {
    return this.arr.length;
  }

  isEmpty() {
    return this.arr.length === 0;
  }
}
let [input, ...arr] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
const [N, M] = input.split(' ').map(Number);
arr = arr.map(line => line.split(''));
const visited = Array.from({length: N}, () => new Array(M).fill(false));
const que = new Queue();
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
for(let i = 0; i < N; i++) {
  for(let j = 0; j < M; j++) {
    if(arr[i][j] === 'I') {
      que.add({x : i, y : j});
      visited[i][j] = true;
    }
  }
}
let cnt = 0;
while(!que.isEmpty()) {
  const node = que.poll();
  for(let i = 0; i < 4; i++) {
    const nx = node.x + dx[i];
    const ny = node.y + dy[i];
    if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || arr[nx][ny] === 'X') continue;
    if(arr[nx][ny] === 'P') cnt++;
    visited[nx][ny] = true;
    que.add({x : nx, y : ny});
  }
}
console.log(cnt === 0 ? 'TT' : cnt);