class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) 
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) < '0' || s.charAt(i) > '9')
                    return false;
        } else return false;
        return true;
    }
}