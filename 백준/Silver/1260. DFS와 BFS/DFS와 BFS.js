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

// DFS
function DFS(node) {
  visited[node] = true;
  ans[0].push(node);
  for(let x of arr[node]) {
    if(!visited[x]) DFS(x);
  }
}

// BFS
function BFS(node) {
  const que = new Queue();
  que.add(node);
  visited[node] = true;
  while(!que.isEmpty()) {
    const num = que.poll();
    ans[1].push(num);
    for(let x of arr[num]) {
      if(!visited[x]) {
        que.add(x);
        visited[x] = true;
      }
    }
  }
}

let [input0, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
const [N, M, V] = input0.split(' ').map(Number);
input = input.map(line => line.split(' ').map(Number));
const arr = Array.from({ length: N + 1 }, () => []);
let visited = new Array(N + 1).fill(false);
const ans = [[], []];
for(let i = 0; i < M; i++) {
  arr[input[i][0]].push(input[i][1]);
  arr[input[i][1]].push(input[i][0]);
}
for(let i = 1; i <= N; i++) {
  if(arr[i].length > 1) arr[i] = arr[i].sort((a, b) => a - b);
}
DFS(V);
visited = new Array(N + 1).fill(false);
BFS(V);
console.log(ans.map(line => line.join(' ')).join('\n'));