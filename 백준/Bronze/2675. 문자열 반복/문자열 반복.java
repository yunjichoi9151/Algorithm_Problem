import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for(int i = 0; i < S.length(); i++) {
                for(int j = 0; j < R; j++) {
                    sb.append(S.charAt(i));
                }
            }
            sb.append('\n');
        }
        System.out.println(sb.toString().trim());
    }
}
