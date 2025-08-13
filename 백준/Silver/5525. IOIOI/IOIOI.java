import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();
        int ans = 0;
        int i = 0;
        while(i < M - 1) {
            if(S[i] == 'I') {
                int cnt = 0;
                while(i + 2 < M && S[i + 1] == 'O' && S[i + 2] == 'I') {
                    cnt++;
                    if(cnt == N) {
                        ans++;
                        cnt--;
                    }
                    i += 2;
                }
                i++;
            } else {
                i++;
            }
        }
        System.out.println(ans);
    }
}
