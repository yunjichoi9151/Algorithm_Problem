import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        A = (A / 100) + (A % 100) / 10 * 10 + (A % 10) * 100;
        B = (B / 100) + (B % 100) / 10 * 10 + (B % 10) * 100;
        System.out.println(A > B ? A : B);
    }
}