function solution(arr) {
    var answer = 0;
    var len = arr.length;
    for(let i = 0; i < len; i++) {
        answer += arr[i];
    }
    return answer / len;
}