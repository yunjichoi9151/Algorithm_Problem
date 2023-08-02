class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean isTrue = false;
                    for(int r = 2; r <= sum / 2; r++) {
                        if(sum % r == 0) {
                            isTrue = true;
                            break;
                        }
                    }
                    if(!isTrue) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}