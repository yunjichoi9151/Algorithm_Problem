function solution(s) {
    var answer = '';
    const map = new Map([
      ["zero", '0'],
      ["one", '1'],
      ["two", '2'],
      ["three", '3'],
      ["four", '4'],
      ["five", '5'],
      ["six", '6'],
      ["seven", '7'],
      ["eight", '8'],
      ["nine", '9'],
    ]);
    let start = 0;
    while(start < s.length) {
        if(s[start] >= '0' && s[start] <= '9') answer += s[start++]
        else {
            var str = '';
            while(start < s.length) {
                str += s[start];
                start++;
                if(map.has(str)) {
                    answer += map.get(str);
                    break;
                }
            }
        }
    }
    return Number(answer);
}