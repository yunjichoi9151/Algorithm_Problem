const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
console.log(input.map(line => line.split(' ').map(Number)).map(([a, b]) => a + b).join('\n'));