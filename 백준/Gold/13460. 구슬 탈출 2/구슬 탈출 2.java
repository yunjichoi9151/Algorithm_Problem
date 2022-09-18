import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Queue<Ball> red_queue;
    static Queue<Ball> blue_queue;
    static char[][] board;
    static boolean[][][][] visit;
    static Ball red_ball, blue_ball;
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};
    static int res = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        board = new char[n][m];
        visit = new boolean[n][m][n][m];
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j);
                if(board[i][j] == 'R') {
                    red_ball = new Ball(i, j, 0);
                }
                else if(board[i][j] == 'B') {
                    blue_ball = new Ball(i, j, 0);
                }
            }
        }
        BFS(red_ball, blue_ball);
        System.out.println(res);
        sc.close();
    }

    public static void BFS(Ball red_ball, Ball blue_ball) {
        red_queue = new LinkedList<>();
        blue_queue = new LinkedList<>();
        red_queue.offer(red_ball);
        blue_queue.offer(blue_ball);
        visit[red_ball.x][red_ball.y][blue_ball.x][blue_ball.y] = true;
        while(!red_queue.isEmpty() && !blue_queue.isEmpty()) {
            Ball tmp_rball = red_queue.poll();
            Ball tmp_bball = blue_queue.poll();

            if(tmp_rball.cnt > 10) {
                res = -1;
                return;
            }

            if(board[tmp_bball.x][tmp_bball.y] == 'O') {
                continue;
            }

            if(board[tmp_rball.x][tmp_rball.y] == 'O') {
                res = tmp_rball.cnt;
                return;
            }

            for(int i = 0; i < 4; i++) {
                int rx = tmp_rball.x;
                int ry = tmp_rball.y;
                while(true) {
                    rx += dx[i];
                    ry += dy[i];
                    if(board[rx][ry] == 'O') {
                        break;
                    }
                    else if(board[rx][ry] == '#') {
                        rx -= dx[i];
                        ry -= dy[i];
                        break;
                    }
                }

                int bx = tmp_bball.x;
                int by = tmp_bball.y;
                while(true) {
                    bx += dx[i];
                    by += dy[i];
                    if(board[bx][by] == 'O') {
                        break;
                    }
                    else if(board[bx][by] == '#') {
                        bx -= dx[i];
                        by -= dy[i];
                        break;
                    }
                }

                if(rx == bx && ry == by && board[rx][ry] != 'O') {
                    int r_dis = Math.abs(tmp_rball.x - rx) + Math.abs(tmp_rball.y - ry);
                    int b_dis = Math.abs(tmp_bball.x - bx) + Math.abs(tmp_bball.y - by);

                    if(r_dis > b_dis) {
                        rx -= dx[i];
                        ry -= dy[i];
                    }
                    else {
                        bx -= dx[i];
                        by -= dy[i];
                    }
                }

                if(!visit[rx][ry][bx][by]) {
                    visit[rx][ry][bx][by] = true;
                    red_queue.offer(new Ball(rx, ry, tmp_rball.cnt + 1));
                    blue_queue.offer(new Ball(bx, by, tmp_bball.cnt + 1));
                }

            }

            

        }
    }
    public static class Ball {
        int x;
        int y;
        int cnt;

        Ball(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}