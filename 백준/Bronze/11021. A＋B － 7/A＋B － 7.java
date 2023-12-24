import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append("Case #" + i + ": " + (a + b) + "\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
}