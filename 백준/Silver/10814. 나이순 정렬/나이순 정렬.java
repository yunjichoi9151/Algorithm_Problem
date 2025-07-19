import java.io.*;
import java.util.*;

public class Main {
    static class User {
        int age;
        String name;
        int idx;
        public User(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        User[] list = new User[N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list[i] = new User(Integer.parseInt(st.nextToken()), st.nextToken(), i);
        }
        Arrays.sort(list, (a, b) -> {
            if(a.age == b.age) return a.idx - b.idx;
            else return a.age - b.age;
        });
        for(int i = 0; i < N; i++) {
            sb.append(list[i].age + " " + list[i].name + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}
