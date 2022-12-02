class Solution {
    static int numberOfArea;
    static int maxSizeOfOneArea;
    static int tmp = 0;
    static boolean[][] visit;
    static int[][] new_picture;
    
    public int[] solution(int m, int n, int[][] picture) {
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        boolean[][] visit = new boolean[m][n];
        new_picture = new int[m][n];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                new_picture[i][j] = picture[i][j];
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(new_picture[i][j] != 0 && !visit[i][j]) {
                    numberOfArea++;
                    dfs(i, j, new_picture, visit);
                }
                if(tmp > maxSizeOfOneArea) {
                    maxSizeOfOneArea = tmp;
                }
                tmp = 0;
            }
        }
        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }
    
        public static void dfs(int r, int c, int[][] picture, boolean[][] visit) {
        int[][] dir = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        if(visit[r][c]) {
            return;
        }
        visit[r][c] = true;
        tmp++;
        for(int i = 0; i < 4; i++) {
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];

            if(nr < 0 || nr >= picture.length || nc < 0 || nc >= picture[0].length) {
                continue;
            }
            if(picture[r][c] == picture[nr][nc] && !visit[nr][nc]) {
                dfs(nr, nc, picture, visit);
            }
        }
    }
}