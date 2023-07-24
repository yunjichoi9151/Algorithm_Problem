import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[21];
        StringBuilder sb = new StringBuilder();

        for (int tc = 0; tc < m; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int x = 0;
            if (!s.equals("all") && !s.equals("empty")) {
                x = Integer.parseInt(st.nextToken());
            }
            switch (s) {
                case "add":
                    arr[x] = true;
                    break;
                case "remove":
                    arr[x] = false;
                    break;
                case "check":
                    sb.append(arr[x] ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    arr[x] = !arr[x];
                    break;
                case "all":
                    for (int i = 1; i <= 20; i++) {
                        arr[i] = true;
                    }
                    break;
                case "empty":
                    for (int i = 1; i <= 20; i++) {
                        arr[i] = false;
                    }
                    break;
            }
        }

        System.out.print(sb);
        br.close();
    }
}