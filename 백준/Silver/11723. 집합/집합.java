import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[21];
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            if(S.equals("all")) {
                for(int n = 1; n <= 20; n++) {
                    arr[n] = true;
                }
            } else if(S.equals("empty")) {
                arr = new boolean[21];
            } else {
                int N = Integer.parseInt(st.nextToken());
                if(S.equals("add")) {
                    if(!arr[N]) arr[N] = true;
                } else if(S.equals("remove")) {
                    arr[N] = false;
                } else if(S.equals("check")) {
                    sb.append((arr[N] ? 1 : 0) + "\n");
                } else if(S.equals("toggle")) {
                    arr[N] = !arr[N];
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}