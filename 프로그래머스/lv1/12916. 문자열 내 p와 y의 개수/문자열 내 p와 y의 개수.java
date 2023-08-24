class Solution {
    boolean solution(String s) {
        int n = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                n++;
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                n--;
            }
        }
        return n == 0 ? true : false;
    }
}