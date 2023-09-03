class Solution {
    public int solution(int n) {
        int before = 0;
        int after = 1;
        for(int i = 2; i <= n; i++) {
            int tmp = (before + after) % 1234567;
            before = after;
            after = tmp;
        }
        return after;
    }
}