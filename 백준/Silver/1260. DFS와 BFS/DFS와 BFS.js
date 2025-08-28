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
    return this.arr.length === this.head;
  }
}

const [[N, M, V], ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const arr = Array.from({length : N + 1}, () => []);
let visited = new Array(N + 1).fill(false);
for(let i = 0; i < M; i++) {
  arr[input[i][0]].push(input[i][1]);
  arr[input[i][1]].push(input[i][0]);
}
for (let i = 1; i <= N; i++) arr[i].sort((a, b) => a - b);
const ans = [[], []];
DFS(V);
const que = new Queue();
visited = visited.fill(false);
que.add(V);
visited[V] = true;
while(!que.isEmpty()) {
  const node = que.poll();
  ans[1].push(node);
  for(let num of arr[node]) {
    if(!visited[num]) {
      que.add(num);
      visited[num] = true;
    }
  }
}
console.log(ans.map(line => line.join(' ')).join('\n'));
function DFS(x) {
  ans[0].push(x);
  visited[x] = true;
  for(let num of arr[x]) {
    if(!visited[num]) {
      DFS(num);
    }
  }
}