import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 인덱스에 해당하는 노드의 부모 정보
            int[] parent = new int[v + 1];
            // 자식 정보
            ArrayList<ArrayList<Integer>> child = new ArrayList<>();
            for(int i = 0; i <= v; i++) {
                child.add(new ArrayList<>());
            }
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < e; i++) {
                int p = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                parent[c] = p;
                child.get(p).add(c);
            }
            // a의 조상 노드 구하기
            ArrayList<Integer> ancestor = new ArrayList<>();
            int now = a;
            while(now != 1) {
                ancestor.add(parent[now]);
                now = parent[now];
            }
            // b의 조상 노드를 따라가면 a와 공통조상 찾기
            now = parent[b];
            int common = 0;
            outerLoop:
            while(now != 0) {
                for(int i = 0; i < ancestor.size(); i++) {
                    if(now == ancestor.get(i)) {
                        common = now;
                        break outerLoop;
                    }
                }
                now = parent[now];
            }
            // 공통 조상을 루트로 하는 서브 트리의 크기
            int cnt = 1;
            Queue<Integer> q = new LinkedList<>();
            q.add(common);
            while(!q.isEmpty()) {
                int cur = q.poll();
                for(int i = 0; i < child.get(cur).size(); i++) {
                    q.add(child.get(cur).get(i));
                    cnt++;
                }
            }
            sb.append("#" + tc + " " + common + " " + cnt + "\n");
        }
        System.out.println(sb);
    }
}