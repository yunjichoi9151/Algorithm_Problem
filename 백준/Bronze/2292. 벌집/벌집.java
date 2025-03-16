import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 1) System.out.println(1);
        else {
            int cnt = 1;
            int sum = 1;
            while(true) {
                if(N <= sum + cnt * 6) {
                    System.out.println(cnt + 1);
                    break;
                } else {
                    sum += cnt++ * 6;
                }
            }
        }
    }
}
