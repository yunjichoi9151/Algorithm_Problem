function solution(t, p) {
    var answer = 0;
    var len = p.length;
    var num = Number(p);
    for(let i = 0; i <= t.length - len; i++) {
        if(Number(t.slice(i, i + len)) <= num) answer++;
    }
    return answer;
}