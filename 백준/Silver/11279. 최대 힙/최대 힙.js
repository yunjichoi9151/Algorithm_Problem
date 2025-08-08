class Heap {
  constructor(compare = (a, b) => a - b) {
    this.heap = [];
    this.compare = compare;
  }

  push(num) {
    this.heap.push(num);
    this._up();
  }

  pop() {
    if (this.heap.length === 0) return 0;
    else if (this.heap.length === 1) return this.heap.pop();
    const top = this.heap[0];
    this.heap[0] = this.heap.pop();
    this._down();
    return top;
  }

  size() {
    return this.heap.length;
  }

  isEmpty() {
    return this.heap.length === 0 ? true : false;
  }

  peek() {
    return this.heap[0];
  }

  _up() {
    let i = this.heap.length - 1;
    while (i > 0) {
      const p = (i - 1) >> 1;
      if (this.compare(this.heap[i], this.heap[p]) >= 0) break;
      this._swap(i, p);
      i = p;
    }
  }

  _down() {
    let i = 0,
      n = this.heap.length;
    while (true) {
      const l = i * 2 + 1;
      const r = i * 2 + 2;
      let best = i;
      if (l < n && this.compare(this.heap[l], this.heap[best]) < 0) best = l;
      if (r < n && this.compare(this.heap[r], this.heap[best]) < 0) best = r;
      if (best === i) break;
      this._swap(i, best);
      i = best;
    }
  }

  _swap(a, b) {
    [this.heap[a], this.heap[b]] = [this.heap[b], this.heap[a]];
  }
}

const [N, ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => Number(line.trim()));
const maxHeap = new Heap((a, b) => b - a);
const ans = [];
for (let i = 0; i < N; i++) {
  if (input[i] === 0) ans.push(maxHeap.pop());
  else maxHeap.push(input[i]);
}
console.log(ans.join("\n"));
