import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println((N / 3 + N % 3) % 2 == 0 ? "CY" : "SK");
        sc.close();
    }
}