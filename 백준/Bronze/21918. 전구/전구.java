import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            switch(a) {
                case 1:
                    arr[b - 1] = c;
                    break;
                case 2:
                    for(int j = b - 1; j < c; j++) {
                        if(arr[j] == 0) {
                            arr[j] = 1;
                        } else {
                            arr[j] = 0;
                        }
                    }
                    break;
                case 3:
                    for(int j = b - 1; j < c; j++) {
                        arr[j] = 0;
                    }
                    break;
                case 4:
                    for(int j = b - 1; j < c; j++) {
                        arr[j] = 1;
                    }
                    break;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}