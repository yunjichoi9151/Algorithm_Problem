import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = -1;
        int sum = 0;
        for (int i = M; i <= N; i++) {
            if (i == 1)
                continue;
            boolean isTrue = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                sum += i;
                if (min == -1)
                    min = i;
            }
        }
        if (min == -1)
            System.out.println(-1);
        else System.out.println(sum + "\n" + min);
    }
}