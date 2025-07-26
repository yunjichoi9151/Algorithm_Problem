import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int M = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[21];
        Arrays.fill(check, false);
        for(int tc = 0; tc < M; tc++) {
            st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            if(S.equals("all")) {
                Arrays.fill(check, true);
            } else if(S.equals("empty")) {
                Arrays.fill(check, false);
            } else {
                int N = Integer.parseInt(st.nextToken());
                if(S.equals("check")) {
                    sb.append(check[N] ? 1 : 0).append("\n");
                } else if(S.equals("add")) {
                    check[N] = true;;
                } else if(S.equals("remove")) {
                    check[N] = false;
                } else if(S.equals("toggle")) {
                    check[N] = !check[N];
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
