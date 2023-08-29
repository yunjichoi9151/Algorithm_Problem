class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++) {
            answer += Integer.toString(i).repeat(food[i] / 2);
        }
        answer += "0";
        for(int i = food.length - 1; i >= 1; i--) {
            answer += Integer.toString(i).repeat(food[i] / 2);
        }
        return answer;
    }
}