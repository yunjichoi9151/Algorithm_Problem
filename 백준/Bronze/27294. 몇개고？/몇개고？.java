import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        if(s == 1 || (t < 12 || t > 16)) {
            System.out.println(280);
        } else if(s == 0 && t >= 12 && t <= 16) {
            System.out.println(320);
        }
        sc.close();
    }
}