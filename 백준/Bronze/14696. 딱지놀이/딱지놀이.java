import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int tc = 1; tc <= n; tc++) {
            int a = sc.nextInt();
            int cnt = 0;
            int[] arr1 = new int[5];
            for(int i = 1; i <= a; i++) {
                arr1[sc.nextInt()]++;
            }
            int b = sc.nextInt();
            int[] arr2 = new int[5];
            for(int i = 1; i <= b; i++) {
                arr2[sc.nextInt()]++;
            }
            for(int i = 4; i >= 1; i--) {
                if(arr1[i] != arr2[i]) {
                    System.out.println(arr1[i] > arr2[i] ? "A" : "B");
                    break;
                }
                else {
                    cnt++;
                    if(cnt == 4) {
                        System.out.println("D");
                        break;
                    }
                    continue;
                }
            }
        }
        sc.close();
    }    
}