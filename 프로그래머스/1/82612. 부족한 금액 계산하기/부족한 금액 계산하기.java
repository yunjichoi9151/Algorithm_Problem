class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for(int i = 1; i <= count; i++)
            sum += (long) price * i;
        return sum <= money ? 0 : sum - money;
    }
}