import java.util.*;
import java.io.*;

public class Main {
  static class Node {
    int x, y, cnt;
    public Node(int x, int y, int cnt) {
      this.x = x;
      this.y = y;
      this.cnt = cnt;
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;
    int T = stoi(br.readLine());
    int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    for(int tc = 0; tc < T; tc++) {
      int l = stoi(br.readLine());
      int[][] map = new int[l][l];
      boolean[][] visited = new boolean[l][l];
      st = new StringTokenizer(br.readLine());
      int[] now = {stoi(st.nextToken()), stoi(st.nextToken())};
      st = new StringTokenizer(br.readLine());
      int[] goal = {stoi(st.nextToken()), stoi(st.nextToken())};
      Queue<Node> que = new LinkedList<>();
      que.add(new Node(now[0], now[1], 0));
      visited[now[0]][now[1]] = true;
      while(!que.isEmpty()) {
        Node node = que.poll();
        if(node.x == goal[0] && node.y == goal[1]) {
          sb.append(node.cnt + "\n");
          break;
        }
        for(int i = 0; i < 8; i++) {
          int nx = node.x + dx[i];
          int ny = node.y + dy[i];
          if(nx < 0 || ny < 0 || nx >= l || ny >= l || visited[nx][ny]) continue;
          que.add(new Node(nx, ny, node.cnt + 1));
          visited[nx][ny] = true;
        }
      }
    }
    System.out.println(sb.toString().trim());
  }

  static int stoi(String S) {
    return Integer.parseInt(S);
  }
}