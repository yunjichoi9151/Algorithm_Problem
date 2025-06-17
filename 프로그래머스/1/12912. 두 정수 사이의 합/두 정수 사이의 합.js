function solution(a, b) {
    var answer = 0;
    let min = Math.min(a, b);
    let max = Math.max(a, b);
    for(let i = min; i <= max; i++) {
        answer += i;
    }
    return answer;
}