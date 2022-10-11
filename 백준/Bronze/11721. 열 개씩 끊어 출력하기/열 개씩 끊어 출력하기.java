import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int idx = 0;
        while(idx != arr.length) {
            System.out.print(arr[idx]);
            idx++;
            if(idx % 10 == 0) {
                System.out.println();
            }
        }
        sc.close();
    }
}