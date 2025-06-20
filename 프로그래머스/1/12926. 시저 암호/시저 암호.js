function solution(s, n) {
    var answer = '';
    for(let i = 0; i < s.length; i++) {
        if(s[i] === ' ') {
            answer += ' '
            continue;
        }
        answer += convert(s[i], n);
    }
    return answer;
}

function convert(c, n) {
    const code = c.charCodeAt(0);
    if (code >= 65 && code <= 90) {
        return String.fromCharCode((code - 65 + n) % 26 + 65);
    }
    if (code >= 97 && code <= 122) {
        return String.fromCharCode((code - 97 + n) % 26 + 97);
    }
    return c;
}