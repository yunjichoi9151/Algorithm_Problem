function solution(s) {
    var len = s.length;
    var answer = new Array(len);
    var check = new Array(26).fill(-1);
    for(let i = 0; i < len; i++) {
        let num = s[i].charCodeAt(0) - 'a'.charCodeAt(0);
        if(check[num] === -1) {
            answer[i] = -1;
        } else {
            answer[i] = i - check[num];
        }
        check[num] = i;
    }
    return answer;
}