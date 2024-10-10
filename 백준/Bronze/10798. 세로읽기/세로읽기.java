import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[15][15];
        for (int i = 0; i < 5; i++) {
            String S = br.readLine();
            for (int j = 0; j < S.length(); j++) {
                arr[i][j] = S.charAt(j);
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if(arr[i][j] != '\0') sb.append(arr[i][j]);
            }
        }
        System.out.println(sb.toString().trim());
    }
}