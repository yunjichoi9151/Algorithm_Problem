function solution(a, b) {
    var answer = 0;
    var max = Math.max(a, b);
    var min = Math.min(a, b);
    for(var i = min; i <= max; i++) {
        answer += i;
    }
    return answer;
}