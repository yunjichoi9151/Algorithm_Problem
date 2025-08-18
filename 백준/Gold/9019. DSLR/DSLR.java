import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int num;
        String cmd;
        public Node(int num, String cmd) {
            this.num = num;
            this.cmd = cmd;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        String[] type = {"D", "S", "L", "R"};
        for(int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            Queue<Node> que = new LinkedList<>();
            boolean[] visited = new boolean[10000];
            que.add(new Node(A, ""));
            visited[A] = true;
            while(!que.isEmpty()) {
                Node node = que.poll();
                if(node.num == B) {
                    sb.append(node.cmd).append("\n");
                    break;
                }
                int tmp = node.num;
                int[] arr = new int[4];
                arr[0] = (tmp * 2) % 10000;
                arr[1] = tmp > 0 ? tmp - 1 : 9999;
                arr[2] = (tmp % 1000) * 10 + (tmp / 1000);
                arr[3] = (tmp % 10) * 1000 + (tmp / 10);
                for(int i = 0; i < 4; i++) {
                    if(!visited[arr[i]]) {
                        visited[arr[i]] = true;
                        que.add(new Node(arr[i], node.cmd + type[i]));
                    }
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
