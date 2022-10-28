class Solution {
    public int solution(String dartResult) {
        char[] dart = dartResult.toCharArray();
        int[] game = new int[3];
        int idx = -1;
        for(int i = 0; i < dart.length; i++) {
            if(dart[i] >= '0' && dart[i] <= '9'){
                idx++;
                if(dart[i] == '1' && dart[i + 1] == '0') {
                    game[idx] = 10;
                    i++;
                } else {
                    game[idx] = dart[i] - '0';
                }
            }
            if(dart[i] == 'D') {
                game[idx] *= game[idx];
            } else if(dart[i] == 'T') {
                game[idx] *= game[idx] * game[idx];
            } else if(dart[i] == '*') {
                if(idx > 0) {
                    game[idx - 1] *= 2;
                }
                game[idx] *= 2;
            } else if(dart[i] == '#') {
                game[idx] *= -1;
            }
        }
        return game[0] + game[1] + game[2];
    }
}