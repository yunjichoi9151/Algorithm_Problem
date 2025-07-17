const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.trim());
let isDone = false;
for(let i = 0; i < 3; i++) {
  if(!isDone && !input[i].startsWith("Fizz") && !input[i].startsWith("Buzz")) {
    isDone = true;
    let num = Number(input[i]) + (3 - i);
    if(num % 15 === 0) console.log("FizzBuzz");
    else if(num % 5 === 0) console.log("Buzz");
    else if(num % 3 === 0) console.log("Fizz");
    else console.log(num);
  }
}