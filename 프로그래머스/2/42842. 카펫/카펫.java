class Solution {
    public int[] solution(int brown, int yellow) {
        int n = brown + yellow;
        for(int i = 3; i <= n; i++) {
            if(n % i == 0 && (n / i + i == brown / 2 + 2)) return new int[]{n / i, i};
        }
        return new int[]{0, 0};
    }
}