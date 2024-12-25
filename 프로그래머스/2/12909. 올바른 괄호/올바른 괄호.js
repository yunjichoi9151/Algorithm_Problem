function solution(s){
    var cnt = 0;
    for(let i = 0; i < s.length; i++) {
        if(s[i] === '(') {
            cnt++;
        } else {
            cnt--;
            if(cnt < 0) return false;
        }
    }
    return cnt === 0;
}