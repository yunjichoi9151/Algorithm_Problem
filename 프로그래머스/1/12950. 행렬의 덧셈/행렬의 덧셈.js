function solution(arr1, arr2) {
    return arr1.map((row, i) =>
        row.map((val, j) => val + arr2[i][j])
    );
}