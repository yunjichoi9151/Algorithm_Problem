import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int max_idx = -1;
        for(int i = 1; i <= 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n > max) {
                max = n;
                max_idx = i;
            }
        }
        System.out.println(max + "\n" + max_idx);
    }
}