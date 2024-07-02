class Solution {
    public int solution(int n) {
        int num = Integer.bitCount(n);
        while(true) {
            if(Integer.bitCount(++n) == num) return n;
        }
    }
}