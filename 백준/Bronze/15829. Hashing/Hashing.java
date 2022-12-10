import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String s = sc.next();
        long[] arr = new long[l];
        long sum = 0;
        for(int i = 0; i < l; i++) {
            arr[i] = s.charAt(i) - 'a' + 1;
            long num = 1;
            for(int j = 1; j <= i; j++) {
                num *= 31;
                num %= 1234567891;
            }
            sum = (sum + (arr[i] * num)) % 1234567891;
        }
        System.out.println(sum);
        sc.close();
    }
}