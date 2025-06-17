function solution(n) {
    var answer = Math.sqrt(n);
    return answer % 1 === 0 ? Math.pow(answer + 1, 2) : -1 ;
}