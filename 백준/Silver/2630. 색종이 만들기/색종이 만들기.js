let [N, ...input] = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(line => line.trim());
N = Number(N);
input = input.map(line => line.split(' ').map(Number));
const ans = [0, 0];
for(let divide = N; divide > 0; divide = Math.floor(divide / 2)) {
  for(let startX = 0; startX < N; startX += divide) {
    for(let startY = 0; startY < N; startY += divide) {
      if(input[startX][startY] === -1) continue;
      let isTrue = true;
      outerLoop:
      for(let i = startX; i < startX + divide; i++) {
        for(let j = startY; j < startY + divide; j++) {
          if(input[startX][startY] != input[i][j]) {
            isTrue = false;
            break outerLoop;
          }
        }
      }
      if(isTrue) {
        ans[input[startX][startY]]++;
        for(let i = startX; i < startX + divide; i++) {
          for(let j = startY; j < startY + divide; j++) {
            input[i][j] = -1;
          }
        }
      }
    }
  }
}
console.log(ans.join('\n'));