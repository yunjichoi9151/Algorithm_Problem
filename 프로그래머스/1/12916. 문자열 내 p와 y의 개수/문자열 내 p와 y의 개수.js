function solution(s){
    let answer = 0;
    s = s.toLowerCase();
    for(let i = 0; i < s.length; i++) {
        if(s[i] === 'p') answer++;
        else if(s[i] === 'y') answer--;
    }
    return answer === 0 ? true : false;
}