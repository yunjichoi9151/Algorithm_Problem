import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] minDp = new int[3];
        int[] maxDp = new int[3];
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (i == 1) {
                maxDp[0] = minDp[0] = a;
                maxDp[1] = minDp[1] = b;
                maxDp[2] = minDp[2] = c;
            } else {
                int beforeMaxDp_0 = maxDp[0], beforeMaxDp_2 = maxDp[2];
                maxDp[0] = Math.max(maxDp[0], maxDp[1]) + a;
                maxDp[2] = Math.max(maxDp[1], maxDp[2]) + c;
                maxDp[1] = Math.max(Math.max(beforeMaxDp_0, maxDp[1]), beforeMaxDp_2) + b;
                int beforeMinDp_0 = minDp[0], beforeMinDp_2 = minDp[2];
                minDp[0] = Math.min(minDp[0], minDp[1]) + a;
                minDp[2] = Math.min(minDp[1], minDp[2]) + c;
                minDp[1] = Math.min(Math.min(beforeMinDp_0, minDp[1]), beforeMinDp_2) + b;
            }
        }
        System.out.print(Math.max(maxDp[0], Math.max(maxDp[1], maxDp[2])) + " ");
        System.out.println(Math.min(minDp[0], Math.min(minDp[1], minDp[2])));
        sc.close();
    }
}