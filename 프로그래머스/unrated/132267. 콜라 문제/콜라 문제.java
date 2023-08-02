class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int coke_bottle = n;
        int empty_bottle = 0;
        while(coke_bottle >= a) {
            empty_bottle += coke_bottle - coke_bottle % a;
            coke_bottle -= empty_bottle - empty_bottle / a * b;
            answer += empty_bottle / a * b;
            empty_bottle = 0;
        }
        return answer;
    }
}