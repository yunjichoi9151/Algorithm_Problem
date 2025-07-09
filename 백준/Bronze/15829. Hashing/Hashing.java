import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        long ans = 0;
        for(int i = 0; i < L; i++) {
            int num = arr[i] - 'a' + 1;
            ans += num * Math.pow(31, i) % 1234567891;
        }
        System.out.println(ans);
    }
}
