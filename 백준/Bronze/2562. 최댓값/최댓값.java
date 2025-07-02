import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int[] answer = {-1, -1};
        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(answer[0] < arr[i]) {
                answer[0] = arr[i];
                answer[1] = i + 1;
            }
        }
        System.out.println(answer[0] + "\n" + answer[1]);
    }
}
