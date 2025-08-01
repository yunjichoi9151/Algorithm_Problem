import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Long[] P = new Long[101];
        P[1] = 1l;
        P[2] = 1l;
        P[3] = 1l;
        P[4] = 2l;
        P[5] = 2l;
        for(int i = 6; i <= 100; i++) {
            P[i] = P[i - 1] + P[i - 5];
        }
        for(int i = 0; i < N; i++) {
            sb.append(P[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
