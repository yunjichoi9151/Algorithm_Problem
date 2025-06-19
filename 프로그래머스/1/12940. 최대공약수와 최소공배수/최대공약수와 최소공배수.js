function solution(n, m) {
    var min = Math.min(n, m);
    var num = 0;
    for(var i = 1; i <= min; i++) {
        if(n % i === 0 && m % i === 0) num = i;
    }
    return [num, n * m / num];
}