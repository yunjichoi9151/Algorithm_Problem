import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int N = A * B * C;
        int[] cnt = new int[10];
        while(N > 0) {
            cnt[N % 10]++;
            N /= 10;
        }
        for(int i = 0; i < 10; i++) {
            sb.append(cnt[i] + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}
