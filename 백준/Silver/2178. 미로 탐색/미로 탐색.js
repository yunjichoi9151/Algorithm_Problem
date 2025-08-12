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

  isEmpty() {
    return this.arr.length === 0;
  }
}

let [input, ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
const [N, M] = input.split(' ').map(Number);
map = map.map(line => line.split('').map(Number));
const visited = Array.from({length: N}, () => new Array(M).fill(false));
const que = new Queue();
que.add({x : 0, y : 0, cnt : 1});
visited[0][0] = true;
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
while(!que.isEmpty()) {
  const node = que.poll();
  if(node.x === N - 1 && node.y === M - 1) {
    console.log(node.cnt);
    return;
  }
  for(let i = 0; i < 4; i++) {
    const nx = node.x + dx[i];
    const ny = node.y + dy[i];
    if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] === 0) continue;
    que.add({x : nx, y : ny, cnt : node.cnt + 1});
    visited[nx][ny] = true;
  }
}