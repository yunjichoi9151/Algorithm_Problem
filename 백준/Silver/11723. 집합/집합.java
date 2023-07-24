import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        boolean[] arr = new boolean[21];
        StringBuilder sb = new StringBuilder();
        for(int tc = 0; tc < m; tc++) {
            String s = sc.next();
            int x = 0;
            if (!s.equals("all") && !s.equals("empty")) {
                x = sc.nextInt();
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
        sc.close();
    }
}