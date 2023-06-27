import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isStar = true;
        for(int i = 0; i < n; i++) {
            isStar = true;
            for(int j = 0; j < 2 * n - 1; j++) {
                if(j < n - i - 1) {
                    System.out.print(' ');
                } else {
                    if(isStar) {
                        System.out.print('*');
                        isStar = false;
                    } else {
                        System.out.print(' ');
                        isStar = true;
                    }
                }
                if(j == n + i - 1) {
                    break;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}