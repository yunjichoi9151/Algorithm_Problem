import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < X.length(); i++) {
            num1[X.charAt(i) - '0']++;
        }
        for(int i = 0; i < Y.length(); i++) {
            num2[Y.charAt(i) - '0']++;
        }
        for(int i = 9; i >= 0; i--) {
            if(num1[i] != 0 && num2[i] != 0) {
                int min = Math.min(num1[i], num2[i]);
                for(int j = 0; j < min; j++) {
                    sb.append(i + "");
                }
            }
        }
        if(sb.toString().length() > 0) {
            if(sb.charAt(0) == '0') {
                return "0";
            } else {
                return sb.toString();
            }
        } else {
            return "-1";
        }
    }
}