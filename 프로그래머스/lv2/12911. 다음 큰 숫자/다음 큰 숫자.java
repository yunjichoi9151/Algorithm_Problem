class Solution {
    public int solution(int n) {
        int num = n + 1;
        int len = cal(n);
        while(true) {
            if(cal(num) == len) return num;
            else num++;
        }
    }
    public int cal(int x) {
        int sum = 0;
        String s =  Integer.toBinaryString(x);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') sum++;
        }
        return sum;
    }
}