import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        long sum1 = 0;
        long sum2 = 0;
        if((sum1 + sum2) % 2 != 0) return -1;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        int cnt = 0;
        while(cnt <= queue1.length * 4){
            if(sum1 > sum2){
                int poll = q1.poll();
                sum1 -= poll;
                sum2 += poll;
                q2.add(poll);
            }else if(sum1 < sum2){
                int poll = q2.poll();
                sum2 -= poll;
                sum1 += poll;
                q1.add(poll);
            }else if(sum1 == sum2){
                answer = cnt;
                break;
            }
            cnt++;
        }
        return answer;
    }
}