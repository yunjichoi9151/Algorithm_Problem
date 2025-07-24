import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int del = (int) Math.round(N * 0.15);
        double sum = 0;
        for(int i = del; i < N - del; i++) {
            sum += arr[i];
        }
        System.out.println((int) Math.round(sum / (N - del * 2)));
    }
}
