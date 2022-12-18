import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int m1 = sc.nextInt(), m2 = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(arr[i][0] == m1)
                sum += Math.abs(arr[i][1] - m2);
            else if((arr[i][0] == 1 && m1 == 2) || (arr[i][0] == 2 && m1 == 1)) {
                int r1 = w - arr[i][1];
                int r2 = w - m2;
                sum += h + ((arr[i][1] + m2) < (r1 + r2) ? (arr[i][1] + m2) : (r1 + r2));
            }
            else if((arr[i][0] == 3 && m1 == 4) || (arr[i][0] == 4 && m1 == 3)) {
                int r1 = h - arr[i][1];
                int r2 = h - m2;
                sum += w + ((arr[i][1] + m2) < (r1 + r2) ? (arr[i][1] + m2) : (r1 + r2));
            }
            else if((arr[i][0] == 1 && m1 == 3) || (arr[i][0] == 3 && m1 == 1))
                sum += arr[i][1] + m2;
            else if((arr[i][0] == 2 && m1 == 4) || (arr[i][0] == 4 && m1 == 2))
                sum += (w + h) - (arr[i][1] + m2);
            else if(arr[i][0] == 1 && m1 == 4)
                sum += (w - arr[i][1]) + m2;
            else if(arr[i][0] == 4 && m1 == 1)
                sum += arr[i][1] + (w - m2);
            else if(arr[i][0] == 2 && m1 == 3)
                sum += arr[i][1] + (h - m2);
            else if(arr[i][0] == 3 && m1 == 2)
                sum += (h - arr[i][1]) + m2;
        }
        System.out.println(sum);
        sc.close();
    }
}