class Solution {
    public String solution(int n) {
        return "수박".repeat(n / 2) + (n % 2 == 1 ? "수" : "");
    }
}