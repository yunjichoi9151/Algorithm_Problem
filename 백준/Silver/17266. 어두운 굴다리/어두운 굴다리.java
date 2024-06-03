import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = stoi(br.readLine());
        int M = stoi(br.readLine());
        int max_dis = 0;
        int[] dis = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            dis[i] = stoi(st.nextToken());
            if(i > 0) {
                int tmp = dis[i] - dis[i - 1];
                max_dis = Math.max(tmp / 2 + (tmp % 2 == 0 ? 0 : 1), max_dis);
            }
        }
        max_dis = Math.max(Math.max(dis[0], max_dis), N - dis[M - 1]);
        System.out.println(max_dis);
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}