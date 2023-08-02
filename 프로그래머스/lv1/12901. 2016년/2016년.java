class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int num = b + 4;
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(a > 1) {
            for(int i = 0; i < a - 1; i++) {
                num += day[i];
            }
        }
        switch(num % 7) {
            case 0:
                answer = "SUN";
                break;
            case 1:
                answer = "MON";
                break;
            case 2:
                answer = "TUE";
                break;
            case 3:
                answer = "WED";
                break;
            case 4:
                answer = "THU";
                break;
            case 5:
                answer = "FRI";
                break;
            case 6:
                answer = "SAT";
                break;
        }
        return answer;
    }
}