class Solution {
    public int solution(String dartResult) {
        int[] arr = new int[3];
        int answer = 0;
        int idx = 0;
        int idx2 = 0;
        while(idx2 < dartResult.length()) {
            char c = dartResult.charAt(idx2);
            switch(c) {
                case 'S':
                    idx++;
                    break;
                case 'D':
                    arr[idx] = (int)Math.pow(arr[idx], 2);
                    idx++;
                    break;
                case 'T':
                    arr[idx] = (int)Math.pow(arr[idx], 3);
                    idx++;
                    break;
                case '*':
                    arr[idx - 1] *= 2;
                    if(idx - 2 >= 0) {
                        arr[idx - 2] *= 2;
                    }
                    break;
                case '#':
                    arr[idx - 1] *= -1;
                    break;
                default:
                    arr[idx] = c - '0';
                    if(arr[idx] == 1 && dartResult.charAt(idx2 + 1) == '0') {
                        idx2++;
                        arr[idx] = 10;
                    }
                    break;
            }
            idx2++;
        }
        for(int n : arr) {
            answer += n;
        }
        return answer;
    }
}