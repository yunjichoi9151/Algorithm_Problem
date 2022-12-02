import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int tmp = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++) {
            for(int j = tmp; j < B.length; j++) {
                if(A[i] < B[j]) {
                    answer++;
                    tmp = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}