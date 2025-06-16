import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        outerLoop:
        for(int i = 0; i < 8; i++) {
            for(int j = i + 1; j < 9; j++) {
                if(arr[i] + arr[j] + 100 == sum) {
                    arr[i] = 0;
                    arr[j] = 0;
                    break outerLoop;
                }
            }
        }
        Arrays.sort(arr);
        for(int i = 2; i < 9; i++) {
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}
