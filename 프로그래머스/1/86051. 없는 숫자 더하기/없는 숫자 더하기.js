function solution(numbers) {
    const set = new Set(numbers);
    var answer = 45;
    for(let n of set) {
        answer -= n;
    }
    return answer;
}