import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String S = br.readLine();
        for(int i = 0; i < N; i++) {
            sum += Integer.parseInt(S.charAt(i) + "");
        }
        System.out.println(sum);
    }
}