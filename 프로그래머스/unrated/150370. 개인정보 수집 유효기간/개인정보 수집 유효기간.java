import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] now_date = convert(today);
        int now_num = now_date[0] * 12 * 28 + now_date[1] * 28 + now_date[2];
        int[] char_arr = new int[26];
        for(int i = 0; i < terms.length; i++) {
            String[] tmp = terms[i].split(" ");
            char_arr[tmp[0].charAt(0) - 'A'] = Integer.parseInt(tmp[1]);
        }
        for(int i = 0; i < privacies.length; i++) {
            int[] start_date = convert(privacies[i].substring(0, 10));
            start_date[1] = start_date[1] + char_arr[privacies[i].charAt(11) - 'A'];
            if(start_date[1] > 12) {
                start_date[0] += start_date[1] / 12;
                start_date[1] = start_date[1] % 12;
            }
            int start_num = start_date[0] * 12 * 28 + start_date[1] * 28 + start_date[2];
            if(now_num >= start_num) {
                list.add(i + 1);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
    static int[] convert(String s) {
        int[] arr = new int[3];
        String[] str_arr = s.split("\\.");
        for(int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(str_arr[i]);
        }
        return arr;
    }
}