import java.util.Scanner;

public class Main {
    static int n, s, cnt = 0;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0, 0);
        System.out.println(s == 0 ? cnt - 1 : cnt);
    }

    public static void dfs(int x, int y) {
        if(x == n) {
            if(y == s) {
                cnt++;
            }
            return;
        }
        dfs(x + 1, y + arr[x]);
        dfs(x + 1, y);
    }
}