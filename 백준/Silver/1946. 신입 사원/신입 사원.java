import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());
            Integer[][] arr = new Integer[n][2];
            int cnt = 1;
            for(int i = 0; i < n; i++) {
                String[] tmp = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(tmp[0]);
                arr[i][1] = Integer.parseInt(tmp[1]);
            }
            Arrays.sort(arr, (n1, n2) -> n1[0] - n2[0]);
            int compare = arr[0][1];
            for(int i = 1; i < n; i++) {
                if(arr[i][1] < compare) {
                    compare = arr[i][1];
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}