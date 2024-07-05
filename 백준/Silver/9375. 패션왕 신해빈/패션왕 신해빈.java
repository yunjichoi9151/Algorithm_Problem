import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String value = st.nextToken();
                map.put(value, map.getOrDefault(value, 0) + 1);
            }
            ArrayList<String> keySet = new ArrayList<>(map.keySet());
            int answer = 1;
            for(int i = 0; i < keySet.size(); i++) {
                answer *= (map.get(keySet.get(i)) + 1);
            }
            answer = (keySet.size() == 0) ? 0 : answer - 1;
            sb.append(answer + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}