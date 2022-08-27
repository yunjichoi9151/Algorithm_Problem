import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = new String[s.length()];
        int cnt = 0, l = s.length();
        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) + "";
            if(i > 0) {
                if(arr[i].equals("=")) {
                    if(arr[i - 1].equals("c")) {
                        cnt++;
                        l -= 2;
                    }
                    else if(arr[i - 1].equals("s")) {
                        cnt++;
                        l -= 2;
                    }
                    else if(arr[i - 1].equals("z")) {
                        if(i > 1 && arr[i - 2].equals("d")) {
                            cnt++;
                            l -= 3;
                        }
                        else {
                            cnt++;
                            l -= 2;
                        }
                    }
                }
                else if(arr[i].equals("-")) {
                    if(arr[i - 1].equals("c")) {
                        cnt++;
                        l -= 2;
                    }
                    else if(arr[i - 1].equals("d")) {
                        cnt++;
                        l -= 2;
                    }
                }
                else if(arr[i].equals("j")) {
                    if(arr[i - 1].equals("l")) {
                        cnt++;
                        l -= 2;
                    }
                    else if(arr[i - 1].equals("n")) {
                        cnt++;
                        l -= 2;
                    }
                }
            }
        }
        System.out.println(cnt + l);
    }
}