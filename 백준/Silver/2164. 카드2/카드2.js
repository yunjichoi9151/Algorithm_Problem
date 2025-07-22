class Deque {
  constructor() {
    this.data = {};
    this.head = 0;
    this.tail = 0;
  }

  pushBack(val) {
    this.data[this.tail++] = val;
  }

  pushFront(val) {
    this.data[--this.head] = val;
  }

  popFront() {
    return this.head < this.tail ? this.data[this.head++] : undefined;
  }

  popBack() {
    return this.head < this.tail ? this.data[--this.tail] : undefined;
  }

  size() {
    return this.tail - this.head;
  }

  isEmpty() {
    return this.size() === 0;
  }

  front() {
    return this.data[this.head];
  }

  back() {
    return this.data[this.tail - 1];
  }
}

const N = Number(require('fs').readFileSync('/dev/stdin').toString().trim());
const deque = new Deque();
for(let i = 1; i <= N; i++) {
  deque.pushBack(i);
}
while(deque.size() > 1) {
  deque.popFront();
  deque.pushBack(deque.popFront());
}
console.log(deque.front());