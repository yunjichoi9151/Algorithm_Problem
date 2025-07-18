import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 666;
        int count = 0;
        while(true) {
            if(String.valueOf(ans).contains("666")) {
                count++;
                if(count == N) {
                    System.out.println(ans);
                    break;
                }
            }
            ans++;
        }
    }
}
