import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[][] dir = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
    static Queue<int[]> queue = new LinkedList<>();
    static boolean[][] visit;
    static int size = 0;
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        visit = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(picture[i][j] > 0 && !visit[i][j]) {
                    size = 1;
                    bfs(picture, i, j, m, n);
                    numberOfArea++;
                    if(maxSizeOfOneArea < size) {
                        maxSizeOfOneArea = size;
                    }
                }
            }
        }
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }
    
    
    public static void bfs(int[][] map, int x, int y, int m, int n) {
        queue.add(new int[]{x, y});
        visit[x][y] = true;
        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nr = tmp[0] + dir[i][0];
                int nc = tmp[1] + dir[i][1];
                if(nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }
                if(map[nr][nc] == map[x][y] && !visit[nr][nc]) {
                    queue.add(new int[]{nr, nc});
                    visit[nr][nc] = true;
                    size++;
                }
            }
        }
    }
}