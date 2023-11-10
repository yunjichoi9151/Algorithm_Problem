import java.util.Arrays;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] arr = new String[files.length][3];
        Integer[] idx = new Integer[files.length];
        for(Integer i = 0; i < files.length; i++) {
            idx[i] = i;
        }
        for(int i = 0; i < files.length; i++) {
            arr[i][0] = "";
            arr[i][1] = "";
            arr[i][2] = "";
            for(int j = 0; j < files[i].length(); j++) {
                char c = files[i].charAt(j);
                if(arr[i][1].length() <= 5 && arr[i][2].length() == 0 && c >= '0' && c <= '9') {
                    arr[i][1] += c;
                } else {
                    if(arr[i][1].length() == 0) {
                        arr[i][0] += c;
                    } else {
                        arr[i][2] += c;
                    }
                }
            }
        }
        Arrays.sort(idx, (o1, o2) -> {
            int result = arr[o1][0].toLowerCase().compareTo(arr[o2][0].toLowerCase());
            if(result == 0) {
                result = Integer.compare(Integer.parseInt(arr[o1][1]), Integer.parseInt(arr[o2][1]));
            }
            return result;
        });
        for(int i = 0; i < files.length; i++) {
            answer[i] = files[idx[i]];
        }
        return answer;
    }
}