class Solution {
    public long solution(long n) {
        double answer = Math.sqrt(n) % 1 == 0 ? Math.pow(Math.sqrt(n) + 1, 2) : -1;
        return (long)answer;
    }
}