import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb_all = new StringBuilder();
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringBuilder sb_one = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();
            for(int j = 0; j < arr.length; j++) {
                for(int k = 0; k < N; k++) {
                    sb_one.append(arr[j]);
                }
            }
            sb_all.append(sb_one.toString() + "\n");
        }
        System.out.println(sb_all.toString().trim());
    }
}
