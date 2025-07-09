import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int x = 0; x < N - 2; x++) {
            for(int y = x + 1; y < N - 1; y++) {
                for(int z = y + 1; z < N; z++) {
                    int num = arr[x] + arr[y] + arr[z];
                    if(num <= M && num > max) max = num;
                }
            }
        }
        System.out.println(max);
    }
}
