class Solution {
    public int solution(int[][] sizes) {
        int row_max = 0;
        int col_max = 0;
        for(int i = 0; i < sizes.length; i++) {
            int x = Math.max(sizes[i][0], sizes[i][1]);
            int y = Math.min(sizes[i][0], sizes[i][1]);
            if(row_max < x) {
                row_max = x;
            }
            if(col_max < y) {
                col_max = y;
            }
        }
        return row_max * col_max;
    }
}