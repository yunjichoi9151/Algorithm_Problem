class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[][] num = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for(int i = 0; i < 4; i++) {
            int n1 = h + num[i][0];
            int n2 = w + num[i][1];
            if(n1 >= 0 && n2 >= 0 && n1 < board.length && n2 < board[0].length && board[h][w].equals(board[n1][n2])) {
                answer++;
            }
        }
        return answer;
    }
}