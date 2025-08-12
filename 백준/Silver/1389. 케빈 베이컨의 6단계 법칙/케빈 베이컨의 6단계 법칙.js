class Queue {
  constructor() {
    this.arr = [];
  }

  add(n) {
    this.arr.push(n);
  }

  poll() {
    return this.arr.shift();
  }

  isEmpty() {
    return this.arr.length === 0;
  }
}

const [[N, M], ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const arr = Array.from({length: N + 1}, () => new Set());
let min = Number.MAX_VALUE;
let ans = 0;
for(let [a, b] of input) {
  arr[a].add(b);
  arr[b].add(a);
}
for(let i = 1; i <= N; i++) {
  const tmp = bfs(i);
  if(min > tmp) {
    min = tmp;
    ans = i;
  }
}
console.log(ans);

function bfs(start) {
  const visited = new Array(N + 1).fill(false);
  const que = new Queue();
  que.add([start, 0]);
  visited[start] = true;
  let sum = 0;
  while(!que.isEmpty()) {
    const [now, depth] = que.poll();
    sum += depth;
    for(let num of arr[now]) {
      if(!visited[num]) {
        que.add([num, depth + 1]);
        visited[num] = true;
      }
    }
  }
  return sum;
}