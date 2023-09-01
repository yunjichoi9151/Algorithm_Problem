import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> ans = new ArrayList<>();
        int now = convert(today);
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : terms) {
            String[] arr = s.split(" ");
            map.put(arr[0], Integer.parseInt(arr[1]));
        }
        for(int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            int num = convert(arr[0]) + map.get(arr[1]) * 28;
            if(now >= num) {
                ans.add(i + 1);
            }
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
    
    public int convert(String s) {
        String[] arr = s.split("\\.");
        return (Integer.parseInt(arr[0]) - 1) * 12 * 28 + 
               (Integer.parseInt(arr[1]) - 1) * 28 +
                Integer.parseInt(arr[2]);
    }
}