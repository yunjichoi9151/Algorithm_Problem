const input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => line.trim());
let idx = 0;
const T = Number(input[idx++]);
const ans = [];
for (let tc = 0; tc < T; tc++) {
  const n = Number(input[idx++]);
  const map = new Map();
  for (let i = 0; i < n; i++) {
    const [cloth, category] = input[idx++].split(" ");
    map.set(category, (map.get(category) || 0) + 1);
  }
  let cnt = 1;
  for (const value of map.keys()) {
    cnt *= map.get(value) + 1;
  }
  ans.push(cnt - 1);
}
console.log(ans.join("\n"));
