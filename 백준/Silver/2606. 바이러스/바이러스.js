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

let [N, T, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
T = Number(T);
input = input.map(line => line.split(' ').map(Number));
arr = Array.from({length : N + 1}, () => []);
for(let i = 0; i < T; i++) {
  arr[input[i][0]].push(input[i][1]);
  arr[input[i][1]].push(input[i][0]);
}
const que = new Queue();
const visited = new Array(N + 1).fill(false);
que.add(1);
visited[1] = true;
let cnt = 0;
while(!que.isEmpty()) {
  const num = que.poll();
  for(let tmp of arr[num]) {
    if(!visited[tmp]) {
      que.add(tmp);
      visited[tmp] = true;
      cnt++;
    }
  }
}
console.log(cnt);