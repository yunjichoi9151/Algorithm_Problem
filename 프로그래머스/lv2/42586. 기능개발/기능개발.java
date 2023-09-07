class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] day = new int[progresses.length];
        int cnt = 1;
        int max = day[0] = cal(progresses[0], speeds[0]);
        for(int i = 1; i < day.length; i++) {
            day[i] = cal(progresses[i], speeds[i]);
            if(max < day[i]) {
                max = day[i];
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        int idx = 0;
        max = day[0];
        for(int i = 0; i < day.length; i++) {
            if(max < day[i]) {
                max = day[i];
                idx++;
            }
            if(idx >= answer.length) break;
            answer[idx]++;
        }
        return answer;
    }
    
    public int cal(int pro, int sp) {
        if((100 - pro) % sp == 0) {
            return (100 - pro) / sp;
        } else {
            return (100 - pro) / sp + 1;
        }
    }
}