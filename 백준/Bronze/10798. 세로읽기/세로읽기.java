import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];
        int max_length = 0;
        String answer = "";
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 15; j++) {
                arr[i][j] = '*';
            }
        }
        for(int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            if(s.length() > max_length) {
                max_length = s.length();
            }
            for(int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        for(int j = 0; j < max_length; j++) {
            for(int i = 0; i < 5; i++) {
                if(arr[i][j] != '*') {
                    answer += arr[i][j];
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}