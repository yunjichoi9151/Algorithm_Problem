function solution(n, m) {
    var answer = [];
    const min = Math.min(n, m);
    for(var i = 1; i <= min; i++) {
        if(n % i == 0 && m % i == 0) answer[0] = i;
    }
    answer[1] = n * m / answer[0];
    return answer;
}