function solution(n) {
    var answer = [];
    let idx = 0;
    while(n > 0) {
        answer[idx++] = n % 10;
        n = parseInt(n / 10);
    }
    return answer;
}