class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] tmp = dartResult.split("S|D|T|\\*|#");
        int[] num = new int[3];
        int idx = 0;
        for(int i = 0; i < tmp.length; i++) {
            if(!tmp[i].equals("")) {
                num[idx++] = Integer.parseInt(tmp[i]);
            }
        }
        idx = 0;
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if(c >= '0' && c <= '9') {
                continue;
            } else {
                switch(c) {
                    case 'S':
                        break;
                    case 'D':
                        num[idx] = (int)Math.pow(num[idx], 2);
                        break;
                    case 'T':
                        num[idx] = (int)Math.pow(num[idx], 3);
                        break;
                    case '*':
                        idx--;
                        num[idx] *= 2;
                        if(idx - 1 >= 0) num[idx - 1] *= 2;
                        break;
                    case '#':
                        idx--;
                        num[idx] *= -1;
                        break;
                }
                idx++;
            }
        }
        for(int i = 0; i < 3; i++) {
            answer += num[i];
        }
        return answer;
    }
}