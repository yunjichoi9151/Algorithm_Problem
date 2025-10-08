import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] nums, path;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        nums = new int[N];
        path = new int[M];
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        DFS(0, 0);
        System.out.print(sb);
    }
    static void DFS(int start, int depth) {
        if(depth == M) {
            for(int i = 0; i < M; i++) {
                sb.append(path[i]);
                if(i != M - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i < N; i++) {
            if(i > start && nums[i] == nums[i - 1]) continue;
            path[depth] = nums[i];
            DFS(i, depth + 1);
        }
    }
}
