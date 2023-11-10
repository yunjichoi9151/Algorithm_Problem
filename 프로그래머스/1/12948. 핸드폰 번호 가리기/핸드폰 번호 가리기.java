class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        return "*".repeat(len - 4) + phone_number.substring(len - 4);
    }
}