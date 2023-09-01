import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Set<String>> reported = new HashMap<>();
        HashMap<String, Integer> cnt = new HashMap<>();
        for(String s : id_list) {
            reported.put(s, new HashSet<>());
            cnt.put(s, 0);
        }
        for(String s : report) {
            String[] arr = s.split(" ");
            Set<String> tmp1 = reported.get(arr[1]);
            tmp1.add(arr[0]);
        }
        for(int i = 0; i < id_list.length; i++) {
            Set<String> tmp2 = reported.get(id_list[i]);
            if(tmp2.size() >= k) {
                for(String s : tmp2) {
                    cnt.put(s, cnt.get(s) + 1);
                }
            }
        }
        for(int i = 0; i < answer.length; i++) {
            answer[i] = cnt.get(id_list[i]);
        }
        return answer;
    }
}