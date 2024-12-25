function solution(s) {
    var s = s.split(' ').map(Number);
    return Math.min(...s) + ' ' + Math.max(...s);
}