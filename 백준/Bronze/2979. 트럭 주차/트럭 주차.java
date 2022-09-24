import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = 0, sum = 0;
        int[] arr = new int[101];
        for(int i = 0; i < 3; i++) {
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            for(int j = n1; j < n2; j++) {
                arr[j]++;
            }
            if(max < n2) {
                max = n2;
            }
        }
        for(int i = 1; i < max; i++) {
            switch(arr[i]) {
                case 1:
                    sum += a;
                    break;
                case 2:
                    sum += b * 2;
                    break;
                case 3:
                    sum += c * 3;
                    break;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}