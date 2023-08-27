class Solution {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;
        for(int i = 0; i < sizes.length; i++) {
            int tmp = sizes[i][0] >= sizes[i][1] ? 0 : 1;
            if(row < sizes[i][tmp]) {
                row = sizes[i][tmp];
            }
            if(col < sizes[i][1 - tmp]) {
                col = sizes[i][1 - tmp];
            }
        }
        return row * col;
    }
}