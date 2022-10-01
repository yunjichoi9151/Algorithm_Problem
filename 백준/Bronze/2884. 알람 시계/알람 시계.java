import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = h * 60 + m;
        if(t >= 45) {
            System.out.println(((t - 45) / 60) + " " + ((t - 45) % 60));
        } else {
            System.out.println(((t - 45 + 1440) / 60) + " " + ((t - 45 + 1440) % 60));
        }
        sc.close();
    }
}