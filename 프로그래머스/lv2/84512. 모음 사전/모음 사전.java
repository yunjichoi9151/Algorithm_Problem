import java.util.*;

class Solution {
    public int solution(String word) {
        int ans = 0;
        int num = 3905;
        for(String s : word.split("")) {
            ans += "AEIOU".indexOf(s) * (num /= 5) + 1;
        }
        return ans;
    }
}