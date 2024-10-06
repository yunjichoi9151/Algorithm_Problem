import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < R; j++) {
                    sb.append(arr[i]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}