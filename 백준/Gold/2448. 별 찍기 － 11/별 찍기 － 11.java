import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        char[][] arr = new char[n][n * 2];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n * 2; j++) {
                arr[i][j] = ' ';
            }
        }
        List<Node> list = new ArrayList<>();
        list.add(new Node(0, n - 1));
        int tmp = n;
        while(true) {
            tmp /= 2;
            if(tmp < 3) {
                break;
            }
            int list_size = list.size();
            for(int i = 0; i < list_size; i++) {
                Node N = list.get(i);
                list.add(new Node(N.y + tmp, N.x - tmp));
                list.add(new Node(N.y + tmp, N.x + tmp));
            }
        }

        for(int i = 0; i < list.size(); i++) {
            Node N = list.get(i);

            arr[N.y][N.x] = '*';
            arr[N.y + 1][N.x - 1] = '*';
            arr[N.y + 1][N.x + 1] = '*';
            for(int j = N.x - 2; j <= N.x + 2; j++) {
                arr[N.y + 2][j] = '*';
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2 * n; j++) {
                if(i == n - 1 && j == 2 * n - 1) {
                    break;
                }
                sb.append(arr[i][j]);
            }
            if(i != n - 1) {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }

    public static class Node {
        int y;
        int x;

        Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}