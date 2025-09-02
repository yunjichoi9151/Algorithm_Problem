let [N, ...map] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
let ans = [0, 0];
map = map.map(line => line.split(' ').map(Number));
solve(0, 0, N);
console.log(ans.join('\n'));

function solve(x, y, size) {
  if(check(x, y, size)) {
    if(map[x][y] === 0) ans[0]++;
    else ans[1]++;
    return;
  }
  const half = size / 2;
  solve(x, y, half);
  solve(x, y + half, half);
  solve(x + half, y, half);
  solve(x + half, y + half, half);
}

function check(x, y, size) {
  const type = map[x][y];
  for(let i = x; i < x + size; i++) {
    for(let j = y; j < y + size; j++) {
      if(map[i][j] !== type) return false;
    }
  }
  return true;
}