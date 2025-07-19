let [N, ...input] = require("fs").readFileSync("/dev/stdin").toString().split("\n").map((line) => line.trim());
N = Number(N);
input = input.map((line) => line.split(" ").map(Number));
answer = [];
for (let i = 0; i < N; i++) {
  let cnt = 1;
  for (let j = 0; j < N; j++) {
    if (input[j][0] > input[i][0] && input[j][1] > input[i][1]) cnt++;
  }
  answer.push(cnt);
}
console.log(answer.join(" "));
