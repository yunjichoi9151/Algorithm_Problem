import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int time = h * 60 + m + t;
        if(time >= 24 * 60) time -= 24 * 60;
        System.out.println((time / 60) + " " + (time % 60));
        sc.close();
    }
}