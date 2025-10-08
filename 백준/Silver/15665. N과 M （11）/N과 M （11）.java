import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] nums;
    static ArrayList<Integer> path = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        DFS(0);
        System.out.print(sb);
    }
    static void DFS(int depth) {
        if(depth == M) {
            for(int i = 0; i < M; i++) {
                sb.append(path.get(i));
                if(i != M - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        int before = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            if(before == nums[i]) continue;
            path.add(nums[i]);
            before = nums[i];
            DFS(depth + 1);
            path.remove(path.size() - 1);
        }
    }
}
