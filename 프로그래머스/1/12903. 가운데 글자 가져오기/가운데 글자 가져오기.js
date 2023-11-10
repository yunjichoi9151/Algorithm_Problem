function solution(s) {
    var answer = '';
    var len = s.length;
    var half = parseInt(len / 2);
    return len % 2 === 0 ? s.slice(half - 1, half + 1) : s[half];
}