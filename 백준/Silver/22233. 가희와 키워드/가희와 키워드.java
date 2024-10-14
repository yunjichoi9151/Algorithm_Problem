import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            String[] tmp = br.readLine().split(",");
            for (int j = 0; j < tmp.length; j++) {
                if (set.contains(tmp[j]))
                    set.remove(tmp[j]);
            }
            sb.append(set.size() + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}