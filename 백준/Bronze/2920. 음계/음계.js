const arr = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
let isBigger = arr[0] < arr[1];
for(let i = 2; i < 8; i++) {
  if(((arr[i - 1] < arr[i]) && isBigger) || ((arr[i - 1] > arr[i]) && !isBigger)) continue;
  else {
    console.log('mixed');
    return;
  }
}
console.log(isBigger ? 'ascending' : 'descending');