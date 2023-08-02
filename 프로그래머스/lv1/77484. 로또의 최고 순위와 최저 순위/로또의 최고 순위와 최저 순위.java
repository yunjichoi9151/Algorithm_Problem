class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int zero_cnt = 0;
        int same_cnt = 0;
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) {
                zero_cnt++;
                continue;
            }
            for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]) {
                    same_cnt++;
                }
            }
        }
        if(same_cnt == 0) {
            answer[1] = 6;
        } else {
            answer[1] = 7 - same_cnt;
        }
        if(same_cnt != 0 || zero_cnt != 0) {
            answer[0] = 7 - (same_cnt + zero_cnt);
        } else {
            answer[0] = 6;
        }
        
        return answer;
    }
}