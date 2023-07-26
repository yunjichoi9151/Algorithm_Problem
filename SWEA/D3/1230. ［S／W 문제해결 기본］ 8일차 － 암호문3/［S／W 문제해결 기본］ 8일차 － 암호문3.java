import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for(int tc = 1; tc <= 10; tc++) {
            int n = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int m = sc.nextInt();
            for(int i = 0; i < m; i++) {
                String s = sc.next();
                int idx = 0;
                int cnt = 0;
                switch(s) {
                    case "I":
                        idx = sc.nextInt();
                        cnt = sc.nextInt();
                        for(int j = 0; j < cnt; j++) {
                            list.add(idx + j, sc.nextInt());
                        }
                        break;
                    case "D":
                        idx = sc.nextInt();
                        cnt = sc.nextInt();
                        for(int j = 0; j < cnt; j++) {
                            list.remove(idx);
                        }
                        break;
                    case "A":
                        cnt = sc.nextInt();
                        for(int j = 0; j < cnt; j++) {
                            list.add(sc.nextInt());
                        }
                        break;
                }
            }
            sb.append("#").append(tc).append(" ");
            for(int i = 0; i < 10; i++) {
                sb.append(list.get(i) + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}