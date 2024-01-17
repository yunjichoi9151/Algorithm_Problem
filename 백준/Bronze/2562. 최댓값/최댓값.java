import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max_num = 0;
        int max_idx = 0;
        for(int i = 1; i <= 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if(max_num < n) {
                max_num = n;
                max_idx = i;
            }
        }
        System.out.println(max_num);
        System.out.println(max_idx);
        br.close();
    }
}