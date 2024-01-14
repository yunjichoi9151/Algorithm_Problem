import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        char[][] arr = new char[n][m];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next().toCharArray();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == '-') {
                    ans++;
                    while(j < m && arr[i][j] == '-') {
                        j++;
                    }
                }
            }
        }
        for(int j = 0; j < m; j++) {
            for(int i = 0; i < n; i++) {
                if(arr[i][j] == '|') {
                    ans++;
                    while(i < n && arr[i][j] == '|') {
                        i++;
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}