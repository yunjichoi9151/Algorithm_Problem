import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        while(A != 0 && B != 0 && C != 0) {
            if((Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2))
            || (Math.pow(B, 2) == Math.pow(A, 2) + Math.pow(C, 2))
            || (Math.pow(C, 2) == Math.pow(A, 2) + Math.pow(B, 2))) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
        }
        System.out.println(sb.toString().trim());
    }
}
