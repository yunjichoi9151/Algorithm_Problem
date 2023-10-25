import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] ans = {7, 7};
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) ans[0]--;
            else {
                for(int j = 0; j < 6; j++) {
                    if(lottos[i] == win_nums[j]) {
                        ans[0]--;
                        ans[1]--;
                        break;
                    }
                }
            }
        }
        if(ans[0] == 7) ans[0] = 6;
        if(ans[1] == 7) ans[1] = 6;
        return ans;
    }
}