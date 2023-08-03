class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[][] arr = new int[10][2];
        int x_len = X.length();
        int y_len = Y.length();
        boolean isTrue = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < x_len; i++) {
            arr[X.charAt(i) - '0'][0]++;
        }
        for(int i = 0; i < y_len; i++) {
            arr[Y.charAt(i) - '0'][1]++;
        }
        for(int i = 9; i >= 0; i--) {
            if(arr[i][0] != 0 && arr[i][1] != 0) {
                int tmp = Math.min(arr[i][0], arr[i][1]);
                for(int j = 0; j < tmp; j++) {
                    sb.append(i + "");
                }
                isTrue = true;
            }
        }
        if(!sb.toString().equals("") && sb.charAt(0) == '0') {
            return "0";
        }
        return isTrue ? sb.toString() : "-1";
    }
}