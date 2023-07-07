import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			arr2[i] = arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr2);
		int rank = 0;
		for(int v : arr2) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : arr1) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
        sc.close();
    }
}