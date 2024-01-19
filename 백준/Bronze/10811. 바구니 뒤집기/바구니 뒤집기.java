import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            arr[i] = i;
        }
        for(int k = 0; k < M ; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            for(int x = i; x <= (i + j) / 2; x++) {
                int tmp = arr[x];
                arr[x] = arr[j - x + i];
                arr[j - x + i] = tmp;
            }
        }
        for(int i = 1; i <= N; i++) {
            System.out.print(arr[i] + (i != N ? " " : ""));
        }
    }
}