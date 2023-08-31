class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero_cnt = 0;
        int num = 0;
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) {
                zero_cnt++;
                continue;
            }
            for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]) {
                    num++;
                }
            }
        }
        answer[0] = zero_cnt + num < 2 ? 6 : 7 - (zero_cnt + num);
        answer[1] = num < 2 ? 6 : 7 - num;
        return answer;
    }
}