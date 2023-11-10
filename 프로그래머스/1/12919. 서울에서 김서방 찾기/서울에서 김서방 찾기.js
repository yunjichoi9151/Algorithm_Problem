function solution(seoul) {
    var idx = 0;
    while(true) {
        if(seoul[idx] === "Kim") {
            return "김서방은 " + idx + "에 있다";
        }
        idx++;
    }
    return '';
}