import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int min = 2501;
        char[][] arr = new char[n][m];
        char[][] arr1 = new char[8][8];
        char[][] arr2 = new char[8][8];
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if((i + j) % 2 == 0) {
                    arr1[i][j] = 'W';
                    arr2[i][j] = 'B';
                }
                else {
                    arr1[i][j] = 'B';
                    arr2[i][j] = 'W';
                }
            }
        }
        for(int i = 0; i <= n - 8; i++) {
            for(int j = 0; j <= m - 8; j++) {
                int cnt1 = 0, cnt2 = 0;
                for(int y = 0; y < 8; y++) {
                    for(int x = 0; x < 8; x++) {
                        if (!((arr[i + y][j + x] + "").equals(arr1[y][x] + ""))) {
                            cnt1++;
                        }
                        if (!((arr[i + y][j + x] + "").equals(arr2[y][x] + ""))) {
                            cnt2++;
                        }
                    }
                }
                if(min > (cnt1 < cnt2 ? cnt1 : cnt2)) {
                    min = (cnt1 < cnt2 ? cnt1 : cnt2);
                }
            }
        }
        System.out.println(min);
    }
}