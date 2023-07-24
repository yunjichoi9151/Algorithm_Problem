import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println("#" + t + " " + ((m % Math.pow(2, n) == Math.pow(2, n) - 1) ? "ON" : "OFF"));
        }
        sc.close();
    }
}