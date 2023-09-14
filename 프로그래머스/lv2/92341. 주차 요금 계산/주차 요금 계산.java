import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        TreeMap<String, Integer> time = new TreeMap<>();
        HashMap<String, Integer> car = new HashMap<>();
        for(String s : records) {
            String[] arr = s.split(":| ");
            if(time.containsKey(arr[2])) {
                if(arr[3].equals("IN")) {
                    time.put(arr[2], convert(arr[0], arr[1]));
                } else {
                    car.put(arr[2], car.getOrDefault(arr[2], 0) + convert(arr[0], arr[1]) - time.get(arr[2]));
                    time.put(arr[2], 0);
                }
            } else {
                time.put(arr[2], convert(arr[0], arr[1]));
            }
        }
        int[] answer = new int[time.size()];
        int idx = 0;
        for(String key : time.keySet()) {
            if(car.containsKey(key) && time.get(key) == 0) {
                answer[idx++] = cal(car.get(key), fees);
            } else {
                answer[idx++] = cal(car.getOrDefault(key, 0) + 23 * 60 + 59 - time.get(key), fees);
            }
        }
        return answer;
    }
    public int cal(int num, int[] fees) {
        if(num <= fees[0]) return fees[1];
        else return fees[1] + (int)Math.ceil((double)(num - fees[0]) / fees[2]) * fees[3];
    }
    public int convert(String s1, String s2) {
        return Integer.parseInt(s1) * 60 + Integer.parseInt(s2);
    }
}