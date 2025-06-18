function solution(absolutes, signs) {
    var answer = 0;
    const len = absolutes.length;
    for(let i = 0; i < len; i++) {
        answer += signs[i] ? absolutes[i] : -absolutes[i];
    }
    return answer;
}