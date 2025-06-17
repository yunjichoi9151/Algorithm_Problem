function solution(x) {
    var answer = 0;
    var tmp = x;
    while(tmp > 0) {
        answer += tmp % 10;
        tmp = Math.floor(tmp / 10);
    }
    return x % answer === 0;
}