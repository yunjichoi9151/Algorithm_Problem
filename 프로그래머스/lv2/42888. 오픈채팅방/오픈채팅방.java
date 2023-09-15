import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        int cnt = 0;
        for(String s : record) {
            String[] arr = s.split(" ");
            if(arr[0].equals("Enter")) {
                map.put(arr[1], arr[2]);
                cnt++;
            } else if(arr[0].equals("Leave")) {
                cnt++;
            } else if(arr[0].equals("Change")) {
                map.put(arr[1], arr[2]);
            }
        }
        String[] answer = new String[cnt];
        int idx = 0;
        for(String s : record) {
            String[] arr = s.split(" ");
            if(arr[0].equals("Enter")) {
                answer[idx++] = map.get(arr[1]) + "님이 들어왔습니다.";
            } else if(arr[0].equals("Leave")) {
                answer[idx++] = map.get(arr[1]) + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}