class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String s = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i])).replaceAll("1", "#");
            answer[i] = s.replaceAll("0", " ");
        }
        return answer;
    }
}