class Solution {
    public int solution(String s) {
        int idx = 0;
        String str = "";
        while(idx < s.length()) {
            String tmp = "";
            while(!(s.charAt(idx) >= '0' && s.charAt(idx) <= '9')) {
                tmp += s.charAt(idx);
                idx++;
                if(tmp.equals("zero")) {
                    str += "0";
                    break;
                } else if(tmp.equals("one")) {
                    str += "1";
                    break;
                }  else if(tmp.equals("two")) {
                    str += "2";
                    break;
                }  else if(tmp.equals("three")) {
                    str += "3";
                    break;
                }  else if(tmp.equals("four")) {
                    str += "4";
                    break;
                }  else if(tmp.equals("five")) {
                    str += "5";
                    break;
                }  else if(tmp.equals("six")) {
                    str += "6";
                    break;
                }  else if(tmp.equals("seven")) {
                    str += "7";
                    break;
                }  else if(tmp.equals("eight")) {
                    str += "8";
                    break;
                }  else if(tmp.equals("nine")) {
                    str += "9";
                    break;
                }
            }
            if(tmp.equals("")) {
                str += s.charAt(idx);
                idx++;
            }
        }
        return Integer.parseInt(str);
    }
}