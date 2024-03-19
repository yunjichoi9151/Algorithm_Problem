import java.util.HashSet;
import java.util.Arrays;

class Solution {
    static HashSet<String> set;
    static boolean[] check;
    public int solution(String[] user_id, String[] banned_id) {
        check = new boolean[user_id.length];
        set = new HashSet<String>();
        for(int i = 0; i < banned_id.length; i++) {
            banned_id[i] = banned_id[i].replace('*', '.');
        }
        cal(0, "", banned_id, user_id);
        return set.size();
    }
    
    static void cal(int d, String s, String[] banned_id, String[] user_id) {
        if(d == banned_id.length) {
            String[] tmp = s.split(" ");
            Arrays.sort(tmp);
            String str = "";
            for(String a : tmp) str += a;
            set.add(str);
            return;
        }
        for(int i = 0; i < user_id.length; i++) {
            if(check[i] || !user_id[i].matches(banned_id[d])) continue;
            check[i] = true;
            cal(d + 1, user_id[i] + " " + s, banned_id, user_id);
            check[i] = false;
        }
    }
}