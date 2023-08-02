class Solution {
    public String solution(int[] food) {
        String answer = "";
        int len = 0;
        for(int i = 0; i < food.length; i++) {
            if(food[i] % 2 == 0) {
                len += food[i];
            } else {
                len += food[i] - 1;
                food[i]--;
            }
        }
        char[] arr = new char[len + 1];
        arr[len / 2] = '0';
        int ans_idx = 0;
        int food_idx = 1;
        while(true) {
            for(int i = 0; i < food[food_idx] / 2; i++) {
                arr[ans_idx] = (char)(food_idx + '0');
                arr[len - ans_idx] = (char)(food_idx + '0');
                ans_idx++;
            }
            food_idx++;
            if(food_idx == food.length) {
                break;
            }
        }
        for(int num : arr) {
            answer += num - '0';
        }
        return answer;
    }
}