function solution(n) {
    var answer = -1;
    var tmp = Math.sqrt(n);
    if(tmp % 1 === 0) answer = Math.pow(tmp + 1, 2);
    return answer;
}