import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n - k + 1];
        for(int tc = 0; tc < n; tc++) {
            arr[tc] = sc.nextInt();
            if(tc >= k - 1) {
                int tmp = 0;
                for(int i = 0; i < k; i++) {
                    tmp += arr[tc - i];
                }
                arr2[tc - (k - 1)] = tmp;
            }
        }
        int max = arr2[0];
        for(int j = 0; j < arr2.length; j++) {
            if(max < arr2[j]) {
                max = arr2[j];
            }
        }
        System.out.println(max);
        sc.close();
    }
}