class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String form = "%0" + n + "d";
        for(int i = 0; i < n; i++) {
            String tmp = Integer.toBinaryString(arr1[i] | arr2[i]);
            tmp = "0".repeat(n - tmp.length()) + tmp;
            answer[i] = tmp.replaceAll("0", " ");
            answer[i] = answer[i].replaceAll("1", "#");
        }
        return answer;
    }
}