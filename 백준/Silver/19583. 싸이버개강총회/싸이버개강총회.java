import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] time = new int[3];
        String[] timeS = br.readLine().split(" ");
        for(int i = 0; i < 3; i++) {
            time[i] = calculate(timeS[i]);
        }
        HashSet<String> set = new HashSet<>();
        String s;
        int answer = 0;
        while((s = br.readLine()) != null && !s.isEmpty()) {
            String[] tmp = s.split(" ");
            int now = calculate(tmp[0]);
            String name = tmp[1];
            if(now <= time[0]) {
                set.add(name);
            } else if(now >= time[1] && now <= time[2]) {
                if(set.contains(name)) {
                    answer++;
                    set.remove(name);
                }
            }
        }
        System.out.println(answer);
    }

    static int calculate(String s) {
        String[] tmp = s.split(":");
        return Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
    }
}