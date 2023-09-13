class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        s = s.replaceAll("0{2,}", "0");
        String[] arr = s.split("0");
        for(int i = 0; i < arr.length; i++) {
            long num = Long.parseLong(arr[i]);
            if(num == 1) continue;
            boolean isTrue = true;
            for(int j = 2; j <= Math.floor(Math.sqrt(num)); j++) {
                if(num % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) answer++;
        }
        return answer;
    }
}