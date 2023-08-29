class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int tmp = nums[i] + nums[j] + nums[k];
                    boolean isTrue = true;
                    for(int r = 2; r < tmp; r++) {
                        if(tmp % r == 0) {
                            isTrue = false;
                            break;
                        }
                    }
                    if(isTrue) answer++;
                }
            }
        }
        return answer;
    }
}