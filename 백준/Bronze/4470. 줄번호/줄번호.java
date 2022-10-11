import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        for(int tc = 1; tc <= n; tc++) {
            System.out.println(tc + ". " + sc.nextLine());
        }
        sc.close();
    }
}