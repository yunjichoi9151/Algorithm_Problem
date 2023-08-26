class Solution {
    public int[] solution(int n, int m) {
        int num = 0;
        for(int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0) {
                num = i;
            }
        }
        return new int[]{num, n * m / num};
    }
}