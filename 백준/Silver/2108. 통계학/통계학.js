const [N, ...input] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((line) => Number(line.trim()));
let sum = 0;
let min = Number.MAX_VALUE;
let max = Number.MIN_VALUE;
let max_cnt = 0;
const cnt_arr = new Array(8001).fill(0);
const ans = [];
for (let i = 0; i < N; i++) {
  let num = input[i] + 4000;
  sum += num - 4000;
  cnt_arr[num]++;
  max_cnt = Math.max(max_cnt, cnt_arr[num]);
  min = Math.min(num, min);
  max = Math.max(num, max);
}
let mid_num = 0;
let max_cnt_num = 0;
let now_cnt = 0;
let cnt_sum = 0;
for (let i = min; i <= max; i++) {
  if (cnt_arr[i] == max_cnt) {
    now_cnt++;
    if (now_cnt <= 2) max_cnt_num = i - 4000;
  }
  if (cnt_sum <= N / 2 && N / 2 < cnt_sum + cnt_arr[i]) {
    mid_num = i - 4000;
  }
  cnt_sum += cnt_arr[i];
}
console.log(
  Math.round(sum / N) + "\n" + mid_num + "\n" + max_cnt_num + "\n" + (max - min)
);
