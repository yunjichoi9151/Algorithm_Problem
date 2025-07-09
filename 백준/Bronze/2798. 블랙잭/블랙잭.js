const [[N, M], input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
let max = 0;
for(let x = 0; x < N - 2; x++) {
  for(let y = x + 1; y < N - 1; y++) {
    for(let z = y + 1; z < N; z++) {
      let num = input[x] + input[y] + input[z];
      if(num <= M && num > max) max = num;
    }
  }
}
console.log(max);