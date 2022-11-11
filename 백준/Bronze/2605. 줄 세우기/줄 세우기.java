import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            if(arr1[i] != 0) {
                for(int j = i; j > i - arr1[i]; j--) {
                    arr2[j] = arr2[j - 1];
                }
                arr2[i - arr1[i]] = i + 1;
            }
            else {
                arr2[i] = i + 1;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }    
}