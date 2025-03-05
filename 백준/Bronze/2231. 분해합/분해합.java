import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = N - 54; i <= N; i++) {
            int sum = i;
            int num = i;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if(sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
