function solution(arr, divisor) {
    var answer = [];
    var idx = 0;
    for(var i = 0; i < arr.length; i++) {
        if(arr[i] % divisor === 0) answer[idx++] = arr[i];
    }
    answer.sort((a, b) => a - b);
    return answer.length === 0 ? [-1] : answer;
}