import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int before = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(before != arr[i]) {
                list.add(arr[i]);
                before = arr[i];
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}