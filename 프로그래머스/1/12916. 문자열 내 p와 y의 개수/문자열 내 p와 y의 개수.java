class Solution {
    boolean solution(String s) {
        int ans = 0;
        s = s.toUpperCase();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'P') ans++;
            else if(s.charAt(i) == 'Y') ans--;
        }
        return ans == 0;
    }
}