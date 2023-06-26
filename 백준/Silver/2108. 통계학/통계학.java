import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[8001];
        ArrayList<Integer> arr3 = new ArrayList<>();
        int sum = 0;
        int max = 0;
        int max_num = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            arr2[arr[i] + 4000]++;
            if(arr2[arr[i] + 4000] > max) {
                max = arr2[arr[i] + 4000];
                max_num = arr[i];
            }
        }
        for(int i = 0; i <= 8000; i++) {
            if(arr2[i] == max) {
                arr3.add(i - 4000);
            }
        }
        Arrays.sort(arr);
        Collections.sort(arr3);
        System.out.println(Math.round((double)sum / (double)n));
        System.out.println(arr[n / 2]);
        System.out.println(arr3.size() > 1 ? arr3.get(1) : max_num);
        System.out.println(arr[n - 1] - arr[0]);
    }
}