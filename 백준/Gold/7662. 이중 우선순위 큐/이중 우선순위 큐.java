import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                String Type = st.nextToken();
                int n = Integer.parseInt(st.nextToken());
                if(Type.equals("I")) {
                    map.put(n, map.getOrDefault(n, 0) + 1);
                } else {
                    if(map.size() == 0) continue;
                    if(n == 1) {
                        int key = map.lastKey();
                        int num = map.get(key);
                        if(num == 1) map.remove(key);
                        else map.put(key, map.get(key) - 1);
                    } else {
                        int key = map.firstKey();
                        int num = map.get(key);
                        if(num == 1) map.remove(key);
                        else map.put(key, map.get(key) - 1);
                    }
                }
            }
            if(map.size() == 0) {
                sb.append("EMPTY").append("\n");
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
