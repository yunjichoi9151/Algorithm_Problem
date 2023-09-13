import java.util.*;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < msg.length(); i++) {
            map.put(msg.charAt(i) + "", msg.charAt(i) - 'A' + 1);
        }
        int idx = 0;
        int now = 27;
        while(idx < msg.length()) {
            String s = msg.charAt(idx) + "";
            while(idx < msg.length() - 1) {
                if(map.containsKey(s + msg.charAt(idx + 1))) {
                    s += msg.charAt(idx + 1);
                } else {
                    map.put(s + msg.charAt(idx + 1), now++);
                    break;
                }
                idx++;
            }
            ans.add(map.get(s));
            idx++;
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}