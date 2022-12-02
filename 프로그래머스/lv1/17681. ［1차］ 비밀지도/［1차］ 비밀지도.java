class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] arr3 = new int[n];
        for(int i = 0; i < n; i++) {
            arr3[i] = arr1[i] | arr2[i];
        }
        for(int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(arr3[i]);
            if(s.length() < n) {
                int k = n - s.length();
                for(int j = 0; j < k; j++) {
                    s = "0" + s;
                }
            }
            s = s.replaceAll("1", "#");
            s = s.replaceAll("0", " ");
            answer[i] = s;
        }
        return answer;
    }
}