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

let [T, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
T = Number(T);
input = input.map(line => line.split(' ').map(Number));
const ans = [];
const type = ['D', 'S', 'L', 'R'];
for(let i = 0; i < T; i++) {
  let A = input[i][0];
  let B = input[i][1];
  const que = new Queue();
  const visited = new Array(10000).fill(false);
  que.add({n : A, str : ''});
  visited[A] = true;
  while(!que.isEmpty()) {
    const node = que.poll();
    if(node.n === B) {
      ans.push(node.str);
      break;
    }
    const now = node.n;
    let arr = new Array(4);
    arr[0] = (now * 2) % 10000;
    arr[1] = now === 0 ? 9999 : now - 1;
    arr[2] = (now % 1000) * 10 + Math.floor(now / 1000);
    arr[3] = (now % 10) * 1000 + Math.floor(now / 10);
    for(let i = 0; i < 4; i++) {
      if(!visited[arr[i]]) {
        visited[arr[i]] = true;
        que.add({n : arr[i], str : node.str + type[i]});
      }
    }
  }
}
console.log(ans.join('\n'));