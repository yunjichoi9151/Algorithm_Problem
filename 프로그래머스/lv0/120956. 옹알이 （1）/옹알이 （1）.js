function solution(babbling) {
    var answer = 0;
    var doIt = ["aya", "ye", "woo", "ma"];
    for(var i in babbling) {
        var tmp = babbling[i];
        for(var j in doIt) {
            if(babbling[i].includes(doIt[j])) {
                tmp = tmp.replace(doIt[j], "X");
            }
        }
        tmp = tmp.replace(/X/gi, "");
        if(tmp.length === 0) {
            answer++;
        }
    }
    return answer;
}