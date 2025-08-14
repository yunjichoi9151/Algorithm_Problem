let [T, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
T = Number(T);
const ans = [];
outerLoop:
for(let tc = 0; tc < T; tc++) {
  const fuc = input[tc * 3].split('');
  const N = Number(input[tc * 3 + 1]);
  const arr = input[tc * 3 + 2] !== '[]' ? input[tc * 3 + 2].substring(1, input[tc * 3 + 2].length - 1).split(',').map(Number) : [];
  let flag = false;
  let start = 0;
  let end = N - 1;
  for(let i = 0; i < fuc.length; i++) {
    if(fuc[i] === 'R') {
      flag = !flag;
    } else {
      if(start > end) {
        ans.push('error');
        continue outerLoop;
      }
      if(!flag) start++;
      else end--;
    }
  }
  let str = '[';
  let tmp = [];
  if(!flag) {
    for(let i = start; i <= end; i++) {
      tmp.push(arr[i]);
    }
  } else {
    for(let i = end; i >= start; i--) {
      tmp.push(arr[i]);
    }
  }
  str += tmp.join(',') + ']';
  ans.push(str);
}
console.log(ans.join('\n'));