function solution(s) {
    var arr = [...s];
    arr.sort((a, b) => {if(a < b) return 1; if(a > b) return -1; if(a === b) return 0;});
    return arr.join('');
}