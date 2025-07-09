import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        long ans = 0;
        long r = 1;
        long mod = 1234567891;
        for(int i = 0; i < L; i++) {
            int num = arr[i] - 'a' + 1;
            ans = (ans + num * r) % mod;
            r = (r * 31) % mod;
        }
        System.out.println(ans);
    }
}
