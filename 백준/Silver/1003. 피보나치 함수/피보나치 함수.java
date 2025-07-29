import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] fib = new int[41][2];
        fib[0] = new int[]{1, 0};
        fib[1] = new int[]{0, 1};
        for(int i = 2; i < 41; i++) {
            fib[i] = new int[]{fib[i - 1][0] + fib[i - 2][0], fib[i - 1][1] + fib[i - 2][1]};
        }
        for(int tc = 0; tc < T; tc++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(fib[n][0]).append(" ").append(fib[n][1]).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
