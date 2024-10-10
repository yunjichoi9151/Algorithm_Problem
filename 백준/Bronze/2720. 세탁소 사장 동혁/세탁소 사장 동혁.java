import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = stoi(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            int N = stoi(br.readLine());
            sb.append(N / 25 + " ");
            N -= 25 * (N / 25);
            sb.append(N / 10 + " ");
            N -= 10 * (N / 10);
            sb.append(N / 5 + " ");
            N -= 5 * (N / 5);
            sb.append(N + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}