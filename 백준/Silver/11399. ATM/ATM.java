import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i][0] = i + 1;
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (a, b) -> {
            return a[1] - b[1];
        });
        int sum = 0;
        int add = 0;
        for(int i = 0; i < N; i++) {
            add += arr[i][1];
            sum += add;
        }
        System.out.println(sum);
    }
}
