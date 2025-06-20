function solution(sizes) {
    var [min, max] = [0, 0];
    for(let i = 0; i < sizes.length; i++) {
        min = Math.max(min, Math.min(sizes[i][0], sizes[i][1]));
        max = Math.max(max, Math.max(sizes[i][0], sizes[i][1]));
    }
    return min * max;
}