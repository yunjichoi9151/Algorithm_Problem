import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int K = stoi(st.nextToken()) - 1;
        int[][] arr = new int[N][3];
        int answer = 1;
        for(int tc = 0; tc < N; tc++) {
            st = new StringTokenizer(br.readLine());
            int T = stoi(st.nextToken()) - 1;
            for(int i = 0; i < 3; i++) {
                arr[T][i] = stoi(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++) {
            if(i == K) continue;
            if(arr[i][0] > arr[K][0]
             || (arr[i][0] == arr[K][0] && arr[i][1] > arr[K][1])
             || (arr[i][0] == arr[K][0] && arr[i][1] == arr[K][1] && arr[i][2] > arr[K][2])) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}