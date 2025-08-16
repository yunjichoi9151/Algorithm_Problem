    const readline = require('readline');

    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    class Heap {
        constructor(CompareFunc) {
            this.heap = [null];
            this.CompareFunc = CompareFunc;
        }

        Insert(item) {
            let Current = this.heap.length;
            while (Current > 1) {
                const Parent = Math.floor(Current / 2);
                if (this.CompareFunc(this.heap[Parent], item)) {
                    this.heap[Current] = this.heap[Parent];
                    Current = Parent;
                } else break;
            }
            this.heap[Current] = item;
        }

        Pop() {
            if (this.heap.length > 2) {
                const PopItem = this.heap[1];
                this.heap[1] = this.heap.pop();
                let Current = 1;
                let LeftChild = Current * 2;
                let RightChild = Current * 2 + 1;
                while (this.heap[LeftChild]) {
                    let Compare = LeftChild;
                    if (this.heap[RightChild] && this.CompareFunc(this.heap[LeftChild], this.heap[RightChild])) {
                        Compare = RightChild;
                    }
                    if (this.CompareFunc(this.heap[Current], this.heap[Compare])) {
                        [this.heap[Current], this.heap[Compare]] = [this.heap[Compare], this.heap[Current]];
                        Current = Compare;
                        LeftChild = Current * 2;
                        RightChild = Current * 2 + 1;
                    } else break;
                }
                return PopItem;
            } else if (this.heap.length === 2) {
                return this.heap.pop();
            } else {
                return null;
            }
        }

        GetLength() {
            return this.heap.length - 1;
        }

        GetMin() {
            return this.heap.length > 1 ? this.heap[1] : null;
        }

        Clear() {
            this.heap = [null];
        }
    }


    const MinPQ = new Heap((a,b) => a > b);
    const MaxPQ = new Heap((a,b) => a < b);
    let index = 0;
    let EndLine = 0;
    let visited = new Map();
    let answer = [];
    rl.on('line', (line) => {
        if (index === 0) {
            index++;
            return;
        }
        if (index > EndLine) {
            EndLine = +line + index++;
            MinPQ.Clear();
            MaxPQ.Clear();
            visited.clear();
            return;
        }
        const [Order, Num] = line.split(' ')
        if (Order === 'I') {
            const InsertItem = parseInt(Num);
            MinPQ.Insert(InsertItem);
            MaxPQ.Insert(InsertItem);
            if (visited.has(InsertItem)) {
                visited.set(InsertItem, visited.get(InsertItem) + 1);
            } else {
                visited.set(InsertItem, 1);
            }
        } else {
            if (Num === '1') {
                while (MaxPQ.GetLength()) {
                    const MaxPop = MaxPQ.Pop();
                    if (visited.get(MaxPop) > 0) {
                        visited.set(MaxPop, visited.get(MaxPop) - 1);
                        break;
                    }
                }
            } else {
                while (MinPQ.GetLength()) {
                    const MinPop = MinPQ.Pop();
                    if (visited.get(MinPop) > 0) {
                        visited.set(MinPop, visited.get(MinPop) - 1);
                        break;
                    }
                }
            }
        }
        if (index === EndLine) {
            while (MaxPQ.GetLength() && visited.get(MaxPQ.GetMin()) === 0) {
                MaxPQ.Pop();
            }
            let max = MaxPQ.GetMin();
            while (MinPQ.GetLength() && visited.get(MinPQ.GetMin()) === 0) {
                MinPQ.Pop();
            }
            let min = MinPQ.GetMin();
            answer.push(max === null && min === null ? 'EMPTY' : `${max} ${min}`);
        }
        index++
    })

    rl.on('close', () => {
        console.log(answer.join('\n'))
    })