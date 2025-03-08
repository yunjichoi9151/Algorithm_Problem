import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];
        for(int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }
        for(int i = 0; i < 10001; i++) {
            for(int j = 0; j < cnt[i]; j++) {
                sb.append(i + "\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
