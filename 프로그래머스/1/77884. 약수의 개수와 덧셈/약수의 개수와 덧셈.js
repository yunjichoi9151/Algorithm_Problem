function solution(left, right) {
    var answer = 0;
    for (let i = left; i <= right; i++) {
        const sqrt = Math.sqrt(i);
        answer += Number.isInteger(sqrt) ? -i : i;
    }
    return answer;
}