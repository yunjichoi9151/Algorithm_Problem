import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        double num1 = 0.0;
        double num2 = 0.0;
        double same = 0.0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < str1.length() - 1; i++) {
            String s = "" + str1.charAt(i) + str1.charAt(i + 1);
            if(isPossible(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
                num1++;
            }
        }
        for(int i = 0; i < str2.length() - 1; i++) {
            String s = "" + str2.charAt(i) + str2.charAt(i + 1);
            if(isPossible(s)) {
                if(map.containsKey(s) && map.get(s) > 0) {
                    map.put(s, map.get(s) - 1);
                    same++;
                }
                num2++;
            }
        }
        if(same != 0 || num1 + num2 - same != 0) {
            return (int)(65536 * same / (num1 + num2 - same));
        } else {
            return 65536;
        }
    }
    
    public boolean isPossible(String s) {
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z' && s.charAt(1) >= 'a' && s.charAt(1) <= 'z') {
            return true;
        } else {
            return false;
        }
    }
}