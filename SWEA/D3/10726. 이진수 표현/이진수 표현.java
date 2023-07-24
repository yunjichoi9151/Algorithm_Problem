import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int tmp = (1 << n) - 1;
            System.out.println("#" + t + " " + ((m & tmp) == tmp ? "ON" : "OFF"));
        }
        sc.close();
    }
}