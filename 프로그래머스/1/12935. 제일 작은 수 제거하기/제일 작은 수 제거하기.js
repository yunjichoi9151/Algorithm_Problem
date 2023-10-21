function solution(arr) {
    var answer = [];
    var min = Math.min(...arr);
    var idx = 0;
    for(var i = 0; i < arr.length; i++) {
        if(arr[i] !== min) answer[idx++] = arr[i];
    }
    return answer.length === 0 ? [-1] : answer;
}