import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double M = 0;
        double sum = 0;
        double[] arr = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            if(arr[i] > M) M = arr[i];
        }
        for(int i = 0; i < N; i++) {
            sum += arr[i] / M * 100;
        }
        System.out.println(sum / N);
    }
}
