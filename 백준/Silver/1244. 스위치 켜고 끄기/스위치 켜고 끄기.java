import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt() + 1;
        int[] arr = new int[s];
        for(int i = 1; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int g = sc.nextInt();
            int s1 = sc.nextInt();
            if(g == 1) {
                for(int j = s1; j < s; j += s1) {
                    arr[j] ^= 1;
                }
            }
            else if(g == 2) {
                int l = s1 - 1;
                int r = s1 + 1;
                while(true) {
                    if(l < 1 || r >= s) break;
                    if(arr[l] != arr[r]) break;
                        l--; r++;
                }
                l++; r--;
                while(l <= r) {
                    arr[l] ^= 1;
                    l++;
                }
            }
        }
        for(int i = 1; i < s; i++) {
            System.out.print(arr[i] + " ");
            if(i % 20 == 0)
                System.out.println();
        }
        sc.close();
    }
}
