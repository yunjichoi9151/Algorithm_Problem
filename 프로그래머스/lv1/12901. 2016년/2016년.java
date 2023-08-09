class Solution {
    public String solution(int a, int b) {
        int num = b + 4;
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        if(a > 1) {
            for(int i = 0; i < a - 1; i++) {
                num += date[i];
            }
        }
        return day[num % 7];
    }
}