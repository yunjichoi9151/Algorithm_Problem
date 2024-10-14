import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = stoi(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] request = new int[N];
        int left = 0, right = -1;
        for (int i = 0; i < N; i++) {
            request[i] = stoi(st.nextToken());
            right = Math.max(right, request[i]);
        }
        int M = stoi(br.readLine());
        while (left <= right) {
            int mid = (left + right) / 2;
            long money = 0;
            for (int i = 0; i < N; i++) {
                if (request[i] > mid)
                    money += mid;
                else
                    money += request[i];
            }
            if (money <= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}