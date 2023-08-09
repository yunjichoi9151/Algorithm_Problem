class Solution {
    static char[][] map;
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        map = new char[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++) {
            char[] tmp = park[i].toCharArray();
            for(int j = 0; j < tmp.length; j++) {
                map[i][j] = tmp[j];
                if(map[i][j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        for(int i = 0; i < routes.length; i++) {
            char op = routes[i].charAt(0);
            int n = routes[i].charAt(2) - '0';
            boolean canDo = true;
            int[] now = {answer[0], answer[1]};
            for(int j = 0; j < n; j++) {
                now = location(op, now[0], now[1]);
                if(!isPossible(park.length, park[0].length(), now[0], now[1])) {
                    canDo = false;
                    break;
                }
            }
            if(canDo) {
                answer[0] = now[0];
                answer[1] = now[1];
            }
        }
        return answer;
    }
    
    static boolean isPossible(int max_x, int max_y, int x, int y) {
        if(x < 0 || x >= max_x || y < 0 || y >= max_y || map[x][y] == 'X') {
            return false;
        }
        return true;
    }
    static int[] location(char op, int x, int y) {
        switch(op) {
            case 'N':
                x--;
                break;
            case 'S':
                x++;
                break;
            case 'W':
                y--;
                break;
            case 'E':
                y++;
                break;
        }
        return new int[] {x, y};
    }
}