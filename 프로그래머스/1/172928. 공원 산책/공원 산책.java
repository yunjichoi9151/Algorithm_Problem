class Solution {
    public int[] solution(String[] park, String[] routes) {
        char[][] map = new char[park.length][park[0].length()];
        int[] ans = new int[2];
        String direction = "NSWE";
        int[][] cal = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {
                map[i][j] = park[i].charAt(j);
                if(map[i][j] == 'S') {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        for(int i = 0; i < routes.length; i++) {
            int dir = direction.indexOf(routes[i].charAt(0));
            int num = routes[i].charAt(2) - '0';
            boolean isPossible = true;
            for(int j = 1; j <= num ; j++) {
                int tmp1 = ans[0] + j * cal[dir][0];
                int tmp2 = ans[1] + j * cal[dir][1];
                if(tmp1 >= map.length || tmp2 >= map[0].length || tmp1 < 0 || tmp2 < 0 || map[tmp1][tmp2] == 'X') {
                    isPossible = false;
                    break;
                }
            }
            if(isPossible) {
                ans[0] += num * cal[dir][0];
                ans[1] += num * cal[dir][1];
            }
        }
        return ans;
    }
}