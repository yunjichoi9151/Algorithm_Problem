class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int origin = x;
        while(origin > 0) {
            sum += origin % 10;
            origin /= 10;
        }
        return x % sum == 0;
    }
}