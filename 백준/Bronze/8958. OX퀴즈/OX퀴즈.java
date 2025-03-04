import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            char[] arr = br.readLine().toCharArray();
            int ans = 0;
            int cnt = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == 'O') {
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
