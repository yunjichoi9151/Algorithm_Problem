class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] pocket = new int[200001];
        int cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            if(pocket[nums[i]] == 0) {
                cnt++;
            }
            pocket[nums[i]]++;
        }
        
        return cnt > nums.length / 2 ? nums.length / 2 : cnt;
    }
}