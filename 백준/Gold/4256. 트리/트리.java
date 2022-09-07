import java.util.Scanner;

public class Main {
    static int preorder[];
    static int inorder[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            preorder = new int[n];
            inorder = new int[n];
            for(int i = 0; i < n; i++) {
                preorder[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++) {
                inorder[i] = sc.nextInt();
            }
            transfer(0, n, 0);
            System.out.println();
        }
    }
    public static void transfer(int a, int n, int b) {
        for(int i = a; i < n; i++) {
            if(inorder[i] == preorder[b]) {
                transfer(a, i, b + 1);
                transfer(i + 1, n, b + i - a + 1);
                System.out.print(preorder[b] + " ");
            }
        }
    }
}