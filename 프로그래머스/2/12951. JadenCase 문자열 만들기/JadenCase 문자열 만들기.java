import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            String tmp = s.charAt(i) + "";
            if(i == 0 || (i > 0 && s.charAt(i - 1) == ' ')) tmp = tmp.toUpperCase();
            sb.append(tmp);
        }
        return sb.toString();
    }
}