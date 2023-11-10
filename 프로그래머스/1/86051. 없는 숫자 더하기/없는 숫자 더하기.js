function solution(numbers) {
    var answer = 0;
    var idx = 0;
    numbers.sort();
    for(var i = 0; i < 10; i++) {
        if(numbers[idx] !== i) answer += i;
        else idx++;
    }
    return answer;
}