function solution(n) {
    var answer = [];
    for(var i = 0; i < n; i++) {
        answer.push([]);
    }
    var num = 1;
    var startRow = 0;
    var startCol = 0;
    var endRow = n - 1;
    var endCol = n - 1;
    while(startRow <= endRow && startCol <= endCol) {
        for(var i = startCol; i <= endCol; i++) {
            answer[startRow][i] = num++;
        }
        startRow++;
        for(var i = startRow; i <= endCol; i++) {
            answer[i][endCol] = num++;
        }
        endCol--;
        for(var i = endCol; i >= startCol; i--) {
            answer[endRow][i] = num++;
        }
        endRow--;
        for(var i = endRow; i >= startRow; i--) {
            answer[i][startCol] = num++;
        }
        startCol++;
    }
    return answer;
}