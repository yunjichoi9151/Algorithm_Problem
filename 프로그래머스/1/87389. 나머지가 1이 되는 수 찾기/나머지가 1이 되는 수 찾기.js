function solution(n) {
    var answer = 1;
    while(true) {
        if(n % answer === 1) return answer;
        answer++;
    }
    return 0;
}