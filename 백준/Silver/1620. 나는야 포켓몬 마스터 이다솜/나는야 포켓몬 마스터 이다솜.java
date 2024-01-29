import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map_num = new HashMap<>();
        HashMap<String, Integer> map_string = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= N; i++) {
            String s = br.readLine();
            map_num.put(i, s);
            map_string.put(s, i);
        }
        for(int i = 0; i < M; i++) {
            String s = br.readLine();
            if(s.charAt(0) >= '0' && s.charAt(0) <= '9') {
                sb.append(map_num.get(Integer.parseInt(s)) + "\n");
            } else {
                sb.append(map_string.get(s) + "\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}