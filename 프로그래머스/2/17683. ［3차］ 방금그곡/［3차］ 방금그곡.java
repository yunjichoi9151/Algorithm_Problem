class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        int ans_time = 0;
        m = change(m);
        for(String s : musicinfos) {
            s = change(s);
            String[] arr = s.split(",");
            String tmp = arr[3];
            int time = convertTime(arr[0], arr[1]);
            int len = arr[3].length();
            if(time > len) {
                tmp = arr[3].repeat(time / len) + arr[3].substring(0, time % len);
            } else if(time < len) {
                tmp = arr[3].substring(0, time);
            }
            if(tmp.contains(m) && time > ans_time) {
                answer = arr[2];
                ans_time = time;
            }
        }
        return answer.equals("") ? "(None)" : answer;
    }
    
    public int convertTime(String s1, String s2) {
        String[] arr = s1.split(":");
        int start_time = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
        arr = s2.split(":");
        int end_time = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
        if(start_time > end_time) end_time += 24 * 60;
        return end_time - start_time;
    }
    
    public String change(String s) {
        s = s.replaceAll("C#", "H");
        s = s.replaceAll("D#", "I");
        s = s.replaceAll("F#", "J");
        s = s.replaceAll("G#", "K");
        String result = s.replaceAll("A#", "L");
        return result;
    }
}