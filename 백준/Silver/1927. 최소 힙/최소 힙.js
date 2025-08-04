class Heap {
  constructor() {
    this.heap = [];
  }

  insert(value) {
    this.heap.push(value);
    this.heapifyUp();
  }

  size() {
    return this.heap.length;
  }

  poll() {
    if(this.heap.length === 0) return 0;
    if(this.heap.length === 1) return this.heap.pop();
    const min = this.heap[0];
    this.heap[0] = this.heap.pop();
    this.heapifyDown();
    return min;
  }

  heapifyUp() {
    let index = this.heap.length - 1;
    while (index > 0) {
      const parentIndex = Math.floor((index - 1) / 2);
      if (this.heap[parentIndex] <= this.heap[index]) break;

      [this.heap[parentIndex], this.heap[index]] = [this.heap[index], this.heap[parentIndex]];
      index = parentIndex;
    }
  }

  heapifyDown() {
    let index = 0;
    const length = this.heap.length;

    while (true) {
      let left = index * 2 + 1;
      let right = index * 2 + 2;
      let smallest = index;

      if (left < length && this.heap[left] < this.heap[smallest]) smallest = left;
      if (right < length && this.heap[right] < this.heap[smallest]) smallest = right;

      if (smallest === index) break;

      [this.heap[smallest], this.heap[index]] = [this.heap[index], this.heap[smallest]];
      index = smallest;
    }
  }
}

const [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => Number(line.trim()));
const heap = new Heap();
const ans = [];
for(let i = 0; i < N; i++) {
  if(input[i] === 0) {
    ans.push(heap.size() === 0 ? 0 : heap.poll());
  } else {
    heap.insert(input[i]);
  }
}
console.log(ans.join('\n'));