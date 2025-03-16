import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int num = A * B * C;
        int[] arr = new int[10];
        while(num > 0) {
            arr[num % 10]++;
            num /= 10;
        }
        for(int i = 0; i < 10; i++) {
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}
