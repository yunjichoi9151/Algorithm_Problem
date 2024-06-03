class Solution {
    public int[] solution(int n, int m) {
        int min = Math.min(n, m);
        int ans = 1;
        for(int i = 1; i <= min; i++) {
            if(n % i == 0 && m % i == 0)
                ans = i;
        }
        return new int[]{ans, n * m / ans};
    }
}