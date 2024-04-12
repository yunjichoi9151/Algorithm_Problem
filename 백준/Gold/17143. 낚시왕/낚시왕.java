import java.io.*;
import java.util.*;

class Main {

    static class Shark {
        int speed, direction, size;
    }

    static int R, C, M;
    static int answerSumOfSize = 0;
    static Shark[][] sharks;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sharks = new Shark[R][C];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            Shark shark = new Shark();
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            shark.speed = Integer.parseInt(st.nextToken());
            shark.direction = Integer.parseInt(st.nextToken());
            shark.size = Integer.parseInt(st.nextToken());
            sharks[r - 1][c - 1] = shark;
        }

        solution();
        System.out.println(answerSumOfSize);
    }

    private static void solution() {
        for (int i = 0; i < C; i++) {
            fishing(i);
            moveAllSharks();
        }
    }

    private static void fishing(int col) {
        for (int i = 0; i < R; i++) {
            if (sharks[i][col] != null) {
                answerSumOfSize += sharks[i][col].size;
                sharks[i][col] = null;
                return;
            }
        }
    }

    private static void moveAllSharks() {
        Shark[][] nextSharks = new Shark[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                moveShark(nextSharks, i, j);
            }
        }

        for (int i = 0; i < R; i++) {
            sharks[i] = Arrays.copyOf(nextSharks[i], C);
        }
    }

    private static void moveShark(Shark[][] nextSharks, int i, int j) {
        Shark shark = sharks[i][j];

        if (shark == null) {
            return;
        }

        int X = shark.direction < 3 ? R : C;
        int moveDistance = shark.speed % ((X - 1) * 2);
        int row = i;
        int col = j;

        for (int k = 0; k < moveDistance; k++) {
            if (shark.direction == 1) {
                row--;
                if (row < 0) {
                    shark.direction = 2;
                    row = 1;
                }
            } else if (shark.direction == 2) {
                row++;
                if (row > R - 1) {
                    shark.direction = 1;
                    row = R - 2;
                }
            } else if (shark.direction == 3) {
                col++;
                if (col > C - 1) {
                    shark.direction = 4;
                    col = C - 2;
                }
            } else {
                col--;
                if (col < 0) {
                    shark.direction = 3;
                    col = 1;
                }
            }
        }

        if (nextSharks[row][col] != null && nextSharks[row][col].size > shark.size) {
            return;
        }

        nextSharks[row][col] = shark;
    }
}