function solution(s){
    var answer = 0;
    s = s.toLowerCase();
    for(let c of s) {
        if(c === 'p') answer++;
        else if(c === 'y') answer--;
    }
    return answer === 0;
}