const [[N, M, B], ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim().split(' ').map(Number));
let min = 257;
let max = 0;
for(let i = 0; i < N; i++) {
  for(let j = 0; j < M; j++) {
    if(map[i][j] > max) max = map[i][j];
    if(map[i][j] < min) min = map[i][j];
  }
}
let min_height = 0;
let min_time = Number.MAX_VALUE;
for(let t = max; t >= min; t--) {
  let need = 0, more = 0;
  for(let i = 0; i < N; i++) {
    for(let j = 0; j < M; j++) {
      const h = map[i][j];
      if(h > t) more += h - t;
      else need += t - h;
    }
  }
  if(need <= more + B) {
    const time = more * 2 + need;
    if(time < min_time) {
      min_time = time;
      min_height = t;
    }
  }
}
console.log(min_time + " " + min_height);