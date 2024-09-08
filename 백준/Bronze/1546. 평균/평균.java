import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = stoi(br.readLine());
        int[] arr = new int[N];
        int max = 0;
        double sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = stoi(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        for(int i = 0; i < N; i++) {
            sum += (double)arr[i] / max * 100;
        }
        System.out.println(sum / N);
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}