import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ans = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num < ans[0]) ans[0] = num;
            if(num > ans[1]) ans[1] = num;
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}