import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            System.out.println(s / (n + 1));
        }
        sc.close();
    }
}