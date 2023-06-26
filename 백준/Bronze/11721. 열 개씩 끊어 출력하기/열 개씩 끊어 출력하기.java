import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int tmp = 10;
        int tmp2 = 0;
        int len = arr.length;
        if(len % 10 == 0) {
            for(int i = 0; i < len / 10; i++) {
                while(tmp != 0) {
                    System.out.print(arr[i * 10 + (10 - tmp)]);
                    tmp--;
                }
                System.out.println();
                tmp = 10;
            }
        }
        else {
            for(int i = 0; i < len / 10 + 1; i++) {
                if(i == len / 10) {
                    tmp = len % 10;
                }
                while(tmp != 0) {
                    System.out.print(arr[i * 10 + tmp2]);
                    tmp2++;
                    tmp--;
                }
                System.out.println();
                tmp = 10;
                tmp2 = 0;
            }
        }
        sc.close();
    }
}