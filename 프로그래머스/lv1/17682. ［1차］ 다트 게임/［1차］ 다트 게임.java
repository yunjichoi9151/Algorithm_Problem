class Solution {
    public int solution(String dartResult) {
        int char_idx = 0;
        int arr_idx = -1;
        int[] arr = new int[3];
        while(char_idx < dartResult.length()) {
            char now = dartResult.charAt(char_idx);
            if(now >= '0' && now <= '9') {
                if(arr_idx < 2) {
                    arr_idx++;
                }
                if(char_idx + 1 < dartResult.length() && dartResult.charAt(char_idx + 1) == '0') {
                    arr[arr_idx] = 10;
                    char_idx++;
                } else {
                    arr[arr_idx] = now - '0';
                }
                char_idx++;
                continue;
            }
            switch(now) {
                case 'S':
                    arr[arr_idx] *= 1;
                    break;
                case 'D':
                    arr[arr_idx] = (int)Math.pow(arr[arr_idx], 2);
                    break;
                case 'T':
                    arr[arr_idx] = (int)Math.pow(arr[arr_idx], 3);
                    break;
                case '*':
                    if(arr_idx != 0) {
                        arr[arr_idx - 1] *= 2;
                    }
                    arr[arr_idx] *= 2;
                    break;
                case '#':
                    arr[arr_idx] *= (-1);
                    break;
            }
            char_idx++;
        }
        return arr[0] + arr[1] + arr[2];
    }
}