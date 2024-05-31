import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int P = stoi(br.readLine());
        for(int tc = 0; tc < P; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = stoi(st.nextToken());
            int[] arr = new int[20];
            for(int i = 0; i < 20; i++) {
                arr[i] = stoi(st.nextToken());
            }
            int answer = 0;
            for(int i = 0; i < 19; i++) {
                for(int j = i + 1; j < 20; j++) {
                    if(arr[i] > arr[j]) answer++;
                }
            }
            sb.append(T + " " + answer + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}