import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int tc = 0; tc < N; tc++) {
            int num = Integer.parseInt(st.nextToken());
            if(num == 1) continue;
            boolean isTrue = true;
            for(int i = 2; i <= (num / i); i++) {
                if(num % i == 0) {
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) cnt++;
        }
        System.out.println(cnt);
    }
}
