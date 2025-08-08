import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        int[] tree = new int[N];
        long right = 0;
        long left = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if(tree[i] > right) right = Math.max(right, tree[i]);
        }
        long ans = 0;
        while(left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for(int i = 0; i < N; i++) {
                sum += Math.max(tree[i] - mid, 0);
                if(sum >= M) break;
            }
            if(sum >= M) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
