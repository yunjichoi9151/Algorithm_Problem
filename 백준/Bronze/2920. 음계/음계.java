import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        for(int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean isBigger = arr[0] < arr[1];
        for(int i = 2; i < 8; i++) {
            if((arr[i - 1] < arr[i] && isBigger) || (arr[i - 1] > arr[i] && !isBigger)) continue;
            else {
                System.out.println("mixed");
                return;
            }
        }
        System.out.println(isBigger ? "ascending" : "descending");
    }
}
