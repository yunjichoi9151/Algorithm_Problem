class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < goal.length; i++) {
            if(cnt1 < cards1.length && goal[i].equals(cards1[cnt1])) {
                cnt1++;
            } else if(cnt2 < cards2.length && goal[i].equals(cards2[cnt2])) {
                cnt2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}