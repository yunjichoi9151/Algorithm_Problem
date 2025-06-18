function solution(numbers) {
    var answer = 45;
    var num = [];
    for(let n of numbers) {
        if(!num.includes(n)) {
            num.push(n);
            answer -= n;
        }
    }
    return answer;
}