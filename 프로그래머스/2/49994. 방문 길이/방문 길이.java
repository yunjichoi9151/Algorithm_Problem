import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        String dir = "UDRL";
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int now_x = 0;
        int now_y = 0;
        for(int i = 0; i < dirs.length(); i++) {
            int idx = dir.indexOf(dirs.charAt(i));
            int nx = now_x + dx[idx];
            int ny = now_y + dy[idx];
            if(nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;
            set.add("" + (char)now_x + (char)now_y + (char)nx + (char)ny);
            set.add("" + (char)nx + (char)ny + (char)now_x + (char)now_y);
            now_x = nx;
            now_y = ny;
        }
        
        return set.size() / 2;
    }
}