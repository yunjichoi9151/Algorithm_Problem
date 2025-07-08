import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = stoi(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int ans = 0;
        for(int i = 0; i < 6; i++) {
            arr[i] = stoi(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = stoi(st.nextToken());
        int P = stoi(st.nextToken());
        for(int i = 0; i < 6; i++) {
            ans += arr[i] / T + (arr[i] % T == 0 ? 0 : 1);
        }
        System.out.println(ans + "\n" + (N / P) + " " + (N % P));
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}
