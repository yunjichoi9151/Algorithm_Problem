import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        for(int k = 1; k <= N; k++) {
            arr[k] = k;
        }
        for(int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for(int k = 1; k <= N; k++) {
            System.out.print(arr[k] + (k != N ? " " : ""));
        }
    }
}