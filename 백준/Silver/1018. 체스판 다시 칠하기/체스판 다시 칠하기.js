let [input, ...paint] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const [N, M] = input.split(' ').map(Number);
paint = paint.map(line => line.trim().split(''));
let min = Number.MAX_VALUE;
for(let i = 0; i <= N - 8; i++) {
  for(let j = 0; j <= M - 8; j++) {
    let cnt = [0, 0];
    for(let x = i; x < i + 8; x++) {
      let now = x % 2 == 0 ? 'W' : 'B'
      for(let y = j; y < j + 8; y++) {
        if(paint[x][y] !== now) cnt[0]++;
        else cnt[1]++;
        now = now == 'W' ? 'B' : 'W';
      }
    }
    min = Math.min(min, Math.min(cnt[0], cnt[1]));
  }
}
console.log(min);