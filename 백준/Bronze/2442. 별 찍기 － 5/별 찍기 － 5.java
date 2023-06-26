import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2 * n; j++) {
                if(j < n) {
                    if(j >= n - 1 - i) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                } else {
                    if(j < n + i) {
                        System.out.print('*');
                    } 
                }
            }
            System.out.println();
        }
        sc.close();
    }
}