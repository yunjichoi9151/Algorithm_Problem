const [A, B] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const gcd = (a, b) => (b === 0 ? a : gcd(b, a % b));
const GCD = gcd(A, B);
console.log(GCD + "\n" + (A * B / GCD));