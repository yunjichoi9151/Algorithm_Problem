import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int num = id_list.length;
        int[] ans = new int[num];
        Map<String, Set<String>> reported = new HashMap<>();
        Map<String, Integer> cnt = new HashMap<>();

        for(int i = 0; i < num; i++) {
            reported.put(id_list[i], new HashSet<>());
            cnt.put(id_list[i], 0);
        }

        for(int i = 0; i < report.length; i++) {
            String[] rs = report[i].split(" ");
            Set<String> tmp1 = reported.get(rs[1]);
            tmp1.add(rs[0]);
        }

        for(int i = 0; i < num; i++) {
            Set<String> tmp2 = reported.get(id_list[i]);
            if(tmp2.size() >= k) {
                for(String s : tmp2) {
                    Integer val = cnt.get(s);
                    cnt.replace(s, val + 1);
                }
            }
        }
        for(int i = 0; i < num; i++) {
            ans[i] = cnt.get(id_list[i]);
        }
        return ans;
    }
}