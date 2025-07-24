import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int now_idx = K - 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            list.add(i);
        }
        for(int i = 0; i < N; i++) {
            sb.append(list.remove(now_idx));
            if(i == N - 1) sb.append(">");
            else {
                sb.append(", ");
                now_idx = (now_idx + K - 1) % list.size();
            }
        }
        System.out.println(sb.toString());
    }
}
