import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = stoi(br.readLine());
        int[][] arr = new int[N][2];
        int[] answer = new int[N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = stoi(st.nextToken());
            arr[i][1] = stoi(st.nextToken());
            answer[i] = 1;
        }
        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) answer[j]++;
                else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) answer[i]++;
            }
        }
        for(int i = 0; i < N; i++) {
            sb.append(answer[i] + " ");
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}