import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int max = 0;
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        if(arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println(10000 + arr[0] * 1000);
        } else if(arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.println(1000 + arr[1] * 100);
        } else if(arr[2] == arr[0]) {
            System.out.println(1000 + arr[2] * 100);
        } else {
            System.out.println(max * 100);
        }
        sc.close();
    }
}