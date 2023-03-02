import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double sum1 = 0.0;
        Double sum2 = 0.0;
        for(int i = 0; i < 20; i++) {
            String s = sc.next();
            Double n1 = sc.nextDouble();
            String g = sc.next();
            if(g.equals("P")) {
                continue;
            } else {
                sum1 += n1;
                if(g.equals("A+")) {
                    sum2 += n1 * 4.5;
                } else if(g.equals("A0")) {
                    sum2 += n1 * 4.0;
                } else if(g.equals("B+")) {
                    sum2 += n1 * 3.5;
                } else if(g.equals("B0")) {
                    sum2 += n1 * 3.0;
                } else if(g.equals("C+")) {
                    sum2 += n1 * 2.5;
                } else if(g.equals("C0")) {
                    sum2 += n1 * 2.0;
                } else if(g.equals("D+")) {
                    sum2 += n1 * 1.5;
                } else if(g.equals("D0")) {
                    sum2 += n1 * 1.0;
                } else if(g.equals("F")) {
                    sum2 += n1 * 0;
                }
            }
        }
        System.out.println(sum2 / sum1);
    }
}