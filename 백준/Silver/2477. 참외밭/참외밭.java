import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0, i = 0, j = 0, index1 = 0, index2 = 0, r1 = 0;
        int[] arr = new int[6];
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for(int tc = 1; tc <= 6; tc++) {
            int d = sc.nextInt(), l = sc.nextInt();
            arr[k] = l;
            k++;
            if(d == 1 || d == 2) {
                arr1[i] = l;
                i++;
            }
            else {
                arr2[j] = l;
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int r = 0; r < 6; r++) {
            if(arr[r] == arr1[2]) {
                index1 = r;
                r1 = r;
                break;
            }
        }
        
        for(int r = r1 + 1; r < 6; r++) {
            if(arr[r] == arr2[2]) {
                index2 = r;
                break;
            }
        }


        for(int c = 0; c < r1; c++) {
            if(arr[c] == arr2[2]) {
                index2 = c;
                break;
            }
        }

        
        while(true) {
            if(Math.abs(index1 - index2) == 1) {
                int tmp = arr[0];
                for(int r = 1; r < 6; r++) {
                    arr[r - 1] = arr[r];
                }
                arr[5] = tmp;
                for(int r = 0; r < 6; r++) {
                    if(arr[r] == arr1[2]) {
                        index1 = r;
                        r1 = r;
                        break;
                    }
                }
                for(int r = r1 + 1; r < 6; r++) {
                    if(arr[r] == arr2[2]) {
                        index2 = r;
                        break;
                    }
                }
                for(int c = 0; c < r1; c++) {
                    if(arr[c] == arr2[2]) {
                        index2 = c;
                        break;
                    }
                }
            }
            else {
                System.out.println(n * (arr1[2] * arr2[2] - arr[2] * arr[3]));
                break;
            }
        }
        sc.close();
    }    
}