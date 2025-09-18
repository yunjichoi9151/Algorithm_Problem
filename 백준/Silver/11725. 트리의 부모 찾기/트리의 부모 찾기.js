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

let [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
list = Array.from({length : N + 1}, () => []);
input = input.map(line => line.split(' ').map(Number));
for(let i = 0; i < N - 1; i++) {
  list[input[i][0]].push(input[i][1]);
  list[input[i][1]].push(input[i][0]);
}
const que = new Queue();
const parent = new Array(N + 1).fill(0);
que.add(1);
parent[1] = 1;
while(!que.isEmpty()) {
  const node = que.poll();
  for(let num of list[node]) {
    if(parent[num] != 0) continue;
    parent[num] = node;
    que.add(num);
  }
}
console.log(parent.slice(2).join('\n'));
