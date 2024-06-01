class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n);
        return num % 1 == 0 ? (long)Math.pow(num + 1, 2) : -1;
    }
}