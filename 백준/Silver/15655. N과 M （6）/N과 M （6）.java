import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        DFS(0, 0);
        System.out.print(sb);
    }

    static void DFS(int start, int depth) {
        if(depth == M) {
            for(int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if(i != list.size() - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i < N; i++) {
            list.add(arr[i]);
            DFS(i + 1, depth + 1);
            list.remove(list.size() - 1);
        }
    }
}
