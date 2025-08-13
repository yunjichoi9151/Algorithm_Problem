class Heap {
  constructor() {
    this.heap = [];
  }

  compare(a, b) {
    const absA = Math.abs(a), absB = Math.abs(b);
    if (absA !== absB) return absA - absB;
    return a - b;
  }

  insert(val) {
    this.heap.push(val);
    this._heapifyUp();
  }

  pop() {
    if (this.heap.length === 0) return 0;
    const top = this.heap[0];
    const end = this.heap.pop();
    if (this.heap.length > 0) {
      this.heap[0] = end;
      this._heapifyDown();
    }
    return top;
  }

  _heapifyUp() {
    let idx = this.heap.length - 1;
    const current = this.heap[idx];
    while (idx > 0) {
      const parentIdx = Math.floor((idx - 1) / 2);
      const parent = this.heap[parentIdx];
      if (this.compare(current, parent) >= 0) break;
      this.heap[idx] = parent;
      idx = parentIdx;
    }
    this.heap[idx] = current;
  }

_heapifyDown() {
  let idx = 0;
  const length = this.heap.length;
  const current = this.heap[0];

  while (true) {
    const leftIdx = 2 * idx + 1;
    const rightIdx = 2 * idx + 2;

    if (leftIdx >= length) break;

    let childIdx = leftIdx;
    if (
      rightIdx < length &&
      this.compare(this.heap[rightIdx], this.heap[leftIdx]) < 0
    ) {
      childIdx = rightIdx;
    }

    if (this.compare(this.heap[childIdx], current) >= 0) break;

    this.heap[idx] = this.heap[childIdx];
    idx = childIdx;
  }

  this.heap[idx] = current;
}


  isEmpty() {
    return this.heap.length === 0;
  }
}


const [N, ...arr] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => Number(line.trim()));
const ans = [];
const heap = new Heap();
for(let i = 0; i < N; i++) {
  if(arr[i] === 0) ans.push(heap.pop());
  else heap.insert(arr[i]);
}
console.log(ans.join('\n'));