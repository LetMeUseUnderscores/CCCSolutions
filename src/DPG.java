import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DPG {
    public static int[] memo;
    public static ArrayList<Integer>[] adj;

    public static int dp(int cur) {
        if(memo[cur] != -1) {
            return memo[cur];
        }

        int max = 0;
        for(int neighbor : adj[cur]) {
            max = Math.max(max, dp(neighbor) + 1);
        }

        memo[cur] = max;
        return memo[cur];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        adj = new ArrayList[N];
        for(int i = 0; i < M; i++) {
            int bv = sc.nextInt();
            int ev = sc.nextInt();
            adj[bv].add(ev);
        }
        memo = new int[N + 1];
        Arrays.fill(memo, -1);

        int output = 0;
        for(int i = 1; i <= N; i++) {
            output = Math.max(output, dp(i));

        }
        System.out.println(output);
    }
}
