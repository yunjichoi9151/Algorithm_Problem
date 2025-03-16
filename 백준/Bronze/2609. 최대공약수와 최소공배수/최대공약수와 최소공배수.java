import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int min = Math.min(A, B);
        int div = 0;
        for(int i = 1; i <= min; i++) {
            if(A % i == 0 && B % i == 0) div = i;
        }
        System.out.println(div + "\n" + (A * B / div));
    }
}
