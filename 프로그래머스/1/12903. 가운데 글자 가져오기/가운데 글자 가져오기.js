function solution(s) {
    var mid = Math.floor(s.length / 2);
    return s.length % 2 === 0 ? s.slice(mid - 1, mid + 1) : s[mid];
}