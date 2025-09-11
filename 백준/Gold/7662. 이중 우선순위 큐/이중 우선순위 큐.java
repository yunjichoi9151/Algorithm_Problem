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
                String S = st.nextToken();
                int N = Integer.parseInt(st.nextToken());
                if(S.equals("I")) {
                    map.put(N, map.getOrDefault(N, 0) + 1);
                } else {
                    if(map.isEmpty()) continue;
                    int key = (N == -1 ? map.firstKey() : map.lastKey());
                    int num = map.get(key);
                    if(num == 1) map.remove(key);
                    else map.put(key, num - 1);
                }
            }
            if(map.isEmpty()) sb.append("EMPTY");
            else sb.append(map.lastKey()).append(" ").append(map.firstKey());
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
