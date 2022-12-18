import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[5][5];
        int cnt = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        Loop2:
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
                Loop1:
                for(int r = 0; r < 5; r++) {
                    for(int k = 0; k < 5; k++) {
                        if(arr1[r][k] == arr2[i][j]) {
                            arr1[r][k] = 0;
                            if(i * 5 + j < 12) {
                                break Loop1;
                            }
                        }
                    }              
                }
                for(int r = 0; r < 5; r++) {
                    for(int k = 0; k < 5; k++) {
                        sum1 += arr1[r][k];
                        sum2 += arr1[k][r];
                    }
                    if(sum1 == 0) {
                        cnt++;
                    }
                    if(sum2 == 0) {
                        cnt++;
                    }
                    sum1 = 0;
                    sum2 = 0;
                }
                sum3 = arr1[0][4] + arr1[1][3] + arr1[2][2] + arr1[3][1] + arr1[4][0];
                sum4 = arr1[0][0] + arr1[1][1] + arr1[2][2] + arr1[3][3] + arr1[4][4];
                if(sum3 == 0) {
                    cnt++;
                }
                if(sum4 == 0) {
                    cnt++;
                }
                if(cnt >= 3) {
                    System.out.println(i * 5 + j + 1);
                    break Loop2;
                }
                cnt = 0;
            }
        }
        sc.close();
    }    
}