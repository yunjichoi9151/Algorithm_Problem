import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a += 44031;
        char b = (char) a;
        System.out.println(b);
    }
}
