import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int time = h * 60 * 60 + m * 60 + s + d;
        if(time >= 24 * 60 * 60) {
            time %= 24 * 60 * 60;
        }
        System.out.println((time / (60 * 60) + " " + (time % (60 * 60)) / 60 + " " + (time % (60 * 60)) % 60));
        sc.close();
    }
}