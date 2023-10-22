function solution(n) {
    var answer = '';
    return "수박".repeat(parseInt(n / 2)) + (n % 2 === 0 ? "" : "수");
}