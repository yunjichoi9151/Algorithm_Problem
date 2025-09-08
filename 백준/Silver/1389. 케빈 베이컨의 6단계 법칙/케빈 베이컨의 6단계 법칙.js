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

const [[N, M], ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
const arr = Array.from({ length: N + 1 }, () => []);
let min = Number.MAX_VALUE;
let min_idx = 0;
for(let i = 0; i < M; i++) {
  arr[input[i][0]].push(input[i][1]);
  arr[input[i][1]].push(input[i][0]);
}
for(let i = 1; i <= N; i++) {
  const que = new Queue();
  const visited = new Array(N + 1).fill(false);
  que.add({ x : i, cnt : 0});
  visited[i] = true;
  let sum = 0;
  while(!que.isEmpty()) {
    const node = que.poll();
    sum += node.cnt;
    for(let num of arr[node.x]) {
      if(!visited[num]) {
        que.add({x : num, cnt : node.cnt + 1});
        visited[num] = true;
      }
    }
  }
  if(sum < min) {
    min = sum;
    min_idx = i;
  }
}
console.log(min_idx);