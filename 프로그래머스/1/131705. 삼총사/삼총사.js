function solution(number) {
  var answer = 0;
  const l = number.length;
  for(var i = 0; i < l - 2; i++) {
    for(var j = i + 1; j < l - 1; j++) {
      for(var k = j + 1; k < l; k++) {
        if(number[i] + number[j] + number[k] === 0) {
          answer++;
        }
      }
    }
  }
  return answer;
}