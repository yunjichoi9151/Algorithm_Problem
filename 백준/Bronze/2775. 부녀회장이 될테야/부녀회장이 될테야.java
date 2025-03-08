import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] map = new int[15][14];
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 14; j++) {
                if(i == 0 || j == 0) map[i][j] = j + 1;
                else map[i][j] = map[i - 1][j] + map[i][j - 1];
            }
        }
        for(int i = 0; i < T; i++) {
            sb.append(map[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine()) - 1] + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}
