import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2 * n - 1; j++) {
                if(j < n) {
                    if(j == n - i - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                } else {
                    if(j == n + i - 1) {
                        System.out.print('*');
                    } else if(j < n + i - 1) {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}