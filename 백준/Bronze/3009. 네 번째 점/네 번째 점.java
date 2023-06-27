import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x_ans = 0;
        int y_ans = 0;
        if(x1 == x2) {
            x_ans = x3;
        } else if(x1 == x3) {
            x_ans = x2;
        } else if(x2 == x3) {
            x_ans = x1;
        }
        if(y1 == y2) {
            y_ans = y3;
        } else if(y1 == y3) {
            y_ans = y2;
        } else if(y2 == y3) {
            y_ans = y1;
        }
        System.out.println(x_ans + " " + y_ans);
    }
}