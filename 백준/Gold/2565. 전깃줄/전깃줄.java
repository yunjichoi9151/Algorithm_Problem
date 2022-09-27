import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[][] arr1 = new int[n][2];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i][0] = sc.nextInt();
            arr1[i][1] = sc.nextInt();
        }
        Arrays.sort(arr1, Comparator.comparingInt(o -> o[0]));
        for(int i = 0; i < n; i++) {
            arr2[i] = arr1[i][1];
            arr3[i] = 1;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(arr2[j] < arr2[i]) {
                    arr3[i] = Math.max(arr3[i], arr3[j] + 1);
                    if(max < arr3[i]) {
                        max = arr3[i];
                    }
                }
            }
        }
        System.out.println(n - max);
        sc.close();
    }
}