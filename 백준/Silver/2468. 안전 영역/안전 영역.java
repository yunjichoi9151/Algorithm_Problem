import java.util.*;
import java.io.*;

public class Main {
  static class Node {
    int x, y;
    public Node(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int N = stoi(br.readLine());
    int[][] map = new int[N][N];
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int max = 0;
    int ans = 0;
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < N; j++) {
        map[i][j] = stoi(st.nextToken());
        if(map[i][j] > max) max = map[i][j];
      }
    }
    boolean[][][] visited = new boolean[N][N][max + 1];
    for(int w = 0; w <= max; w++) {
      int cnt = 0;
      for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
          if(map[i][j] > w && !visited[i][j][w]) {
            Queue<Node> que = new LinkedList<>();
            que.add(new Node(i, j));
            visited[i][j][w] = true;
            while(!que.isEmpty()) {
              Node node = que.poll();
              for(int k = 0; k < 4; k++) {
                int nx = node.x + dx[k];
                int ny = node.y + dy[k];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N || map[nx][ny] <= w || visited[nx][ny][w]) continue;
                que.add(new Node(nx, ny));
                visited[nx][ny][w] = true;
              }
            }
            cnt++;
          }
        }
      }
      if(cnt > ans) ans = cnt;
    }
    System.out.println(ans);
  }

  static int stoi(String S) {
    return Integer.parseInt(S);
  }
}