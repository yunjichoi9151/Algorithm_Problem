function solution(price, money, count) {
    var answer = 0;
    for(var i = 1; i <= count; i++) {
        answer += price * i;
    }
    return answer > money ? answer - money : 0;
}