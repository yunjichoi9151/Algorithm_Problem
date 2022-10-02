import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int l = arr.length, cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i > 0) {
                if(arr[i] == '=') {
                    if(arr[i - 1] == 'c') {
                        cnt++;
                        l -= 2;
                    }
                    else if(arr[i - 1] == 's') {
                        cnt++;
                        l -= 2;
                    }
                    else if(arr[i - 1] == 'z') {
                        if(i > 1 && arr[i - 2] == 'd') {
                            cnt++;
                            l -= 3;
                        }
                        else {
                            cnt++;
                            l -= 2;
                        }
                    }
                }
                else if(arr[i] == '-') {
                    if(arr[i - 1] == 'c') {
                        cnt++;
                        l -= 2;
                    }
                    else if(arr[i - 1] == 'd') {
                        cnt++;
                        l -= 2;
                    }
                }
                else if(arr[i] == 'j') {
                    if(arr[i - 1] == 'l') {
                        cnt++;
                        l -= 2;
                    }
                    else if(arr[i - 1] == 'n') {
                        cnt++;
                        l -= 2;
                    }
                }
            }
        }
        System.out.println(cnt + l);
        sc.close();
    }
}