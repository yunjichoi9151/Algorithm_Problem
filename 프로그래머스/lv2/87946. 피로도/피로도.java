class Solution {
    static boolean[] visited;
    static int cnt = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return cnt;
    }
    
    public void dfs(int depth, int num, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= num) {
                visited[i] = true;
                dfs(depth + 1, num - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        cnt = Math.max(cnt, depth);
    }
}