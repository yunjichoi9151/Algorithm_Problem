const N = Number(require('fs').readFileSync('/dev/stdin'));
if(N >= 90) console.log('A');
else if(N >= 80) console.log('B');
else if(N >= 70) console.log('C');
else if(N >= 60) console.log('D');
else console.log('F');