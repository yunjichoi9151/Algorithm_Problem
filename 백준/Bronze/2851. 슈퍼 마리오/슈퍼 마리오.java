import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0, k = 0;
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(sum <= 100) {
                sum += arr[i];
                k = i;
            }
        }
        System.out.println((Math.abs(100 - sum) <= Math.abs(100 - (sum - arr[k])) ? sum : sum - arr[k]));
    }
}