let [N, ...graph] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
N = Number(N);
graph = graph.map(line => line.split(' ').map(Number));
for(let k = 0; k < N; k++) {
  for(let i = 0; i < N; i++) {
    for(let j = 0; j < N; j++) {
      if(graph[i][k] && graph[k][j]) {
        graph[i][j] = 1;
      }
    }
  }
}
console.log(graph.map(line => line.join(' ')).join('\n'));