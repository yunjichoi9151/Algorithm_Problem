class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0};
        char[][] paper = new char[wallpaper.length][wallpaper[0].length()];
        
        for(int i = 0; i < wallpaper.length; i++) {
            char[] tmp = wallpaper[i].toCharArray();
            for(int j = 0; j < tmp.length; j++) {
                paper[i][j] = tmp[j];
                if(paper[i][j] == '#') {
                    if(i < answer[0]) {
                        answer[0] = i;
                    }
                    if(i > answer[2]) {
                        answer[2] = i;
                    }
                    if(j < answer[1]) {
                        answer[1] = j;
                    }
                    if(j > answer[3]) {
                        answer[3] = j;
                    }
                }
            }
        }
        answer[2]++;
        answer[3]++;
        return answer;
    }
}