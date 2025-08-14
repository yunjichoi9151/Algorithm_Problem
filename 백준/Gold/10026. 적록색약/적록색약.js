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

let [N, ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
map = map.map(line => line.split(''));
const visited = Array.from({length : N}, () => Array.from({length : N}, () => new Array(2).fill(false)));
const ans = new Array(2).fill(0);
const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];
for(let i = 0; i < N; i++) {
  for(let j = 0; j < N; j++) {
    if(!visited[i][j][0]) {
      BFS(i, j, true);
      ans[0]++;
    }
    if(!visited[i][j][1]) {
      BFS(i, j, false);
      ans[1]++;
    }
  }
}
console.log(ans.join(' '));

function BFS(x, y, isNormal) {
  const que = new Queue();
  que.add({x : x, y : y});
  visited[x][y][isNormal ? 0 : 1] = true;
  while(!que.isEmpty()) {
    const node = que.poll();
    for(let i = 0; i < 4; i++) {
      const nx = node.x + dx[i];
      const ny = node.y + dy[i];
      if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny][isNormal ? 0 : 1]) continue;
      if((map[node.x][node.y] === map[nx][ny])
        || (!isNormal && ((map[node.x][node.y] === 'G' && map[nx][ny] === 'R')
      || (map[node.x][node.y] === 'R' && map[nx][ny] === 'G')))) {
        que.add({x : nx, y : ny});
        visited[nx][ny][isNormal ? 0 : 1] = true;
      }
    }
  }
}