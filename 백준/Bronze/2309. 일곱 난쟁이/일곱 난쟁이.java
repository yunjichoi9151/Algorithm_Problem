import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int a = 0, b = 0, sum = 0;
        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for(int i = 0; i < 8; i++) {
            for(int j = i + 1; j < 9; j++) {
                if((sum - 100) - arr[i] == arr[j]) {
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
        }
        arr = removeElement(arr, a);
        arr = removeElement(arr, b);
        Arrays.sort(arr);
        for(int i = 0; i < 7; i++)
            System.out.println(arr[i]);
        sc.close();
    }
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
}