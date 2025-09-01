import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long left = 1;
        long right = 0;
        int[] arr = new int[K];
        for(int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > right) right = arr[i];
        }
        while(left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for(int i = 0; i < K; i++) {
                cnt += arr[i] / mid;
            }
            if(cnt >= N) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println(right);
    }
}
