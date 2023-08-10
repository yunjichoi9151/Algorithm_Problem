class Solution {
    public int[] solution(String s) {
        int zero_cnt = 0;
        int time_cnt = 0;
        while(!s.equals("1")) {
            int cnt = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    zero_cnt++;
                } else {
                    cnt++;
                }
            }
            s = Integer.toBinaryString(cnt);
            time_cnt++;
        }
        return new int[] {time_cnt, zero_cnt};
    }
}