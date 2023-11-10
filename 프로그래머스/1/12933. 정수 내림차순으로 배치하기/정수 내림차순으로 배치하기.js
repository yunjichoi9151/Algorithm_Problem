function solution(n) {
    var answer = 0;
    var arr = [];
    var idx = 0;
    while(n > 0) {
        arr[idx++] = n % 10;
        n = parseInt(n / 10);
    }
    arr.sort();
    for(var i = 0; i < arr.length; i++) {
        answer += arr[i] * Math.pow(10, i);
    }
    return answer;
}