import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int result = 0, start = 0, end = arr1.length - 1;
            int mid = (end + start) / 2;
            int tmp = sc.nextInt();
            while(end - start >= 0) {
                if(arr1[mid] == tmp) {
                    result = 1;
                    break;
                }
                else if(arr1[mid] <= tmp) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
                mid = (end + start) / 2;
            }
            System.out.println(result);
        }
    }
}