import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int min = N - ((int)Math.log10(N) + 1) * 9;
        for(int i = min; i < N; i++) {
            int sum = i;
            int tmp = i;
            while(tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if(sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
