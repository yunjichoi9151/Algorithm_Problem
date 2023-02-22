import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int max = 0;
        for(int i = 1; i <= (n1 < n2 ? n1 : n2); i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                if(max < i) {
                    max = i;
                }
            }
        }
        System.out.println(max);
        System.out.println((n1 / max) * (n2 / max) * max);
    }
}