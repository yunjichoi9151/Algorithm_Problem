import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            String S = br.readLine();
            int cnt = 0;
            int ans = 0;
            for(int i = 0; i < S.length(); i++) {
                if(S.charAt(i) == 'O') {
                    ans += ++cnt;
                } else {
                    cnt = 0;
                }
            }
            sb.append(ans + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}
