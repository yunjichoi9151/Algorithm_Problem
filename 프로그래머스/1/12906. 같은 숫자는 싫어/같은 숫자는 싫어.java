import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Queue<Integer> que = new LinkedList<Integer>();
        int before = -1;
        for(int i = 0; i < arr.length; i++) {
            if(before != arr[i]) {
                que.add(arr[i]);
                before = arr[i];
            }
        }
        int[] answer = new int[que.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = que.poll();
        return answer;
    }
}