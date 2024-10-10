import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int[][] arr = new int[N][M];
        for (int t = 0; t < 2; t++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    arr[i][j] += stoi(st.nextToken());
                    if (t == 1)
                        sb.append(arr[i][j]);
                    if (j != M - 1)
                        sb.append(" ");
                    else
                        sb.append("\n");
                }
            }
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}