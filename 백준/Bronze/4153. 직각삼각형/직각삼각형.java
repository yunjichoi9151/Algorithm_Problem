import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String S;
        while(!(S = br.readLine()).equals("0 0 0")) {
            st = new StringTokenizer(S);
            int[] num = new int[3];
            for(int i = 0; i < 3; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(num);
            sb.append(Math.pow(num[2], 2) == (Math.pow(num[0], 2) + Math.pow(num[1], 2)) ? "right\n" : "wrong\n");
        }
        System.out.println(sb.toString().trim());
    }
}
