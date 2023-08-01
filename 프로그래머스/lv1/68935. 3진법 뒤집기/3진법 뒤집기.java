class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        while(true) {
            int tmp = n / (int)Math.pow(3, cnt);
            if(tmp == 1 || tmp == 2) {
                break;
            }
            cnt++;
        }
        int[] arr = new int[cnt + 1];
        for(int i = cnt; i >= 0; i--) {
            arr[i] = n / (int)Math.pow(3, i);
            answer += arr[i] * (int)Math.pow(3, cnt - i);
            n -= arr[i] * (int)Math.pow(3, i);
        }
        return answer;
    }
}