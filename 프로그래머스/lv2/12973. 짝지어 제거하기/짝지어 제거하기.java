import java.util.*;

class Solution {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        int before = 0;
        int after = 1;
        while(after < arr.length) {
            if(arr[after] != ' ' && arr[after] == arr[before]) {
                arr[after] = ' ';
                arr[before] = ' ';
                after += 1;
                before = before == 0 ? after - 1 : before - 1;
            } else {
                after++;
                before++;
            }
        }
        s = new String(arr).replaceAll(" ", "");
        return s.length() == 0 ? 1 : 0;
    }
}