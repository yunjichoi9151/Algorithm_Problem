const [T, ...cases] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
console.log(cases.map(line => line.split(' ').map(Number)).map(([a, b]) => a + b).join('\n'));