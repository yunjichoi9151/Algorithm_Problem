let [N, ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => line.trim())
  .filter((line) => line.length > 0);
N = Number(N);
input = input
  .map((line, idx) => {
    const [age, name] = line.split(" ");
    return { age: Number(age), name, idx };
  })
  .sort((a, b) => {
    if (a.age === b.age) return a.idx - b.idx;
    else return a.age - b.age;
  });
console.log(input.map((person) => person.age + " " + person.name).join("\n"));
