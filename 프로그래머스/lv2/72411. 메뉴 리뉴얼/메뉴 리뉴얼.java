import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    static int[] cnt;
    static Map<String, Integer> map;
    public String[] solution(String[] orders, int[] course) {
        String[] ans = {};
        map = new HashMap<>();
        cnt = new int[course.length];
        for(int i = 0; i < course.length; i++) {
            for(int j = 0; j < orders.length; j++) {
                char arr[] = orders[j].toCharArray();
                Arrays.sort(arr);
                combine(0, course[i], new String(), arr, i);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < course.length; i++) {
            for(Map.Entry<String, Integer> m : map.entrySet()) {
                if(cnt[i] > 1 && course[i] == m.getKey().length() && m.getValue() == cnt[i]) {
                    list.add(m.getKey());
                }
            }
        }
        Collections.sort(list);
        ans = list.toArray(new String[list.size()]);
        return ans;
    }
    static void combine(int idx, int len, String s, char arr[], int cntIdx) {
        if(s.length() == len) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            cnt[cntIdx] = Math.max(cnt[cntIdx], map.get(s));
            return;
        }
        for(int i = idx; i < arr.length; i++) {
            combine(i + 1, len, s + arr[i], arr, cntIdx);
        }
    }
}