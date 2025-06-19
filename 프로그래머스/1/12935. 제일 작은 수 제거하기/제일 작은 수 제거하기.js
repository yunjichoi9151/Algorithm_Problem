function solution(arr) {
    if(arr.length === 1) return [-1];
    var min = Number.MAX_VALUE;
    for(let n of arr) {
        if(n < min) min = n;
    }
    return arr.filter(num => num !== min);
}