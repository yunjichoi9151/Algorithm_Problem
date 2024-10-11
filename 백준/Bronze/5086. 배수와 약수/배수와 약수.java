import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int a = -1;
        int b = -1;
        while (true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0)
                break;
            if (a > b && a % b == 0)
                sb.append("multiple\n");
            else if (a < b && b % a == 0)
                sb.append("factor\n");
            else
                sb.append("neither\n");
        }
        System.out.println(sb.toString().trim());
    }
}