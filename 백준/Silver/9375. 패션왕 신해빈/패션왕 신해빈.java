import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for(int i = 0; i < N; i++) {
                String[] tmp = br.readLine().split(" ");
                map.put(tmp[1], map.getOrDefault(tmp[1], 0) + 1);
            }
            int cnt = 1;
            for(String S : map.keySet()) {
                cnt *= (map.get(S) + 1);
            }
            sb.append(cnt - 1).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
