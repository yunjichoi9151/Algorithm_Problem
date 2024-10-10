import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            boolean[] isIn = new boolean[26];
            boolean Possible = true;
            for (int j = 0; j < S.length(); j++) {
                int num = S.charAt(j) - 'a';
                if (!isIn[num]) {
                    isIn[num] = true;
                } else {
                    if (S.charAt(j - 1) != S.charAt(j)) {
                        Possible = false;
                        break;
                    }
                }
            }
            if (Possible)
                ans++;
        }
        System.out.println(ans);
    }
}