import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][14];
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 14; j++) {
                if(j == 0) {
                    arr[i][0] = 1;
                } else if(i == 0) {
                    arr[0][j] = j + 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        for(int tc = 0; tc < T; tc++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            sb.append(arr[K][N - 1] + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}
