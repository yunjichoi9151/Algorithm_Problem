import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) break;
            else if(a == b && b == c && c == a) sb.append("Equilateral\n");
            else if(a >= b + c || b >= a + c || c >= a + b) sb.append("Invalid\n");
            else if(a != b && b != c && c != a) sb.append("Scalene\n");
            else sb.append("Isosceles\n");
        }
        System.out.println(sb.toString().trim());
    }
}