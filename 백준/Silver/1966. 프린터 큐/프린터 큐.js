class Queue {
  constructor() {
    this.arr = [];
    this.head = 0;
  }

  add(item) {
    this.arr.push(item);
  }

  poll() {
    return this.arr[this.head++];
  }

  isEmpty() {
    return this.head >= this.arr.length;
  }
}

const [T_raw, ...input_raw] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const T = Number(T_raw);
const input = input_raw.map(line => line.split(' ').map(Number));
const answer = [];

for (let tc = 0; tc < T; tc++) {
  const [N, M] = input[tc * 2];
  const arr = input[tc * 2 + 1];
  const que = new Queue();
  const priorities = [...arr];

  for (let i = 0; i < N; i++) {
    que.add([i, arr[i]]);
  }

  let cnt = 0;
  while (!que.isEmpty()) {
    const [idx, priority] = que.poll();
    const maxPriority = Math.max(...priorities);

    if (priority === maxPriority) {
      cnt++;
      priorities.splice(priorities.indexOf(priority), 1);
      if (idx === M) {
        answer.push(cnt);
        break;
      }
    } else {
      que.add([idx, priority]);
    }
  }
}

console.log(answer.join('\n'));
