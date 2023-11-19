function solution(s) {
  const arr = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
  arr.forEach((word, idx) => {
    s = s.split(word).join(idx);
  });
  return parseInt(s, 10);
}