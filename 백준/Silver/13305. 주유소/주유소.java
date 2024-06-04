import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = stoi(br.readLine());
        int[] cost = new int[N];
        int[] dis = new int[N - 1];
        int before = Integer.MAX_VALUE;
        long sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            dis[i] = stoi(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            cost[i] = stoi(st.nextToken());
            if(before < cost[i]) {
                cost[i] = before;
            } else if(before > cost[i]) {
                before = cost[i];
            }
            if(i != N - 1) sum += (long)cost[i] * dis[i];
        }
        System.out.println(sum);
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}