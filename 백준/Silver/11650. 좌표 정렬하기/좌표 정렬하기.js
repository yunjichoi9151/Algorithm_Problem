let [N, ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map((line) => line.trim().split(" ").map(Number))
console.log(
  input
    .sort((a, b) => {
      if (a[0] == b[0]) return a[1] - b[1];
      else return a[0] - b[0];
    })
    .map((line) => line.join(" "))
    .join("\n")
);
