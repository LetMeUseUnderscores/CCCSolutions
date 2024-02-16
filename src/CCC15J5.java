import java.util.Scanner;

public class CCC15J5 {
    static int[][][] memo = new int[251][251][251];
    public static int dp(int n, int k, int m) {
        if(n == k || k == 1) {
            return 1;
        }
        if(memo[n][k][m] != 0) {
            return memo[n][k][m];
        }
        for(int i = m; i < n / k + 1; i++) {
            memo[n][k][m] += dp(n - i, k - 1, i);
        }
        return memo[n][k][m];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(dp(N, K, 1));
    }
}
