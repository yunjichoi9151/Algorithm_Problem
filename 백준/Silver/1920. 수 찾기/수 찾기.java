import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            sb.append(binarySearch(Integer.parseInt(st.nextToken())) ? "1\n" : "0\n");
        }
        System.out.println(sb.toString().trim());
    }

    static boolean binarySearch(int target) {
        int left = 0;
        int right = N - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
