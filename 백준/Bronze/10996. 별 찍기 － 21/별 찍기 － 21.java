import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isStar = true;
        for(int i = 0; i < 2 * n; i++) {
            if(n == 1) {
                System.out.println('*');
                break;
            }
            isStar = i % 2 == 0 ? true : false;
            for(int j = 0; j < n; j++) {
                if(isStar) {
                    System.out.print('*');
                    isStar = false;
                } else {
                    System.out.print(' ');
                    isStar = true;
                }
                if(i % 2 == 0 && j == 2 * n - 2) {
                    break;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}