import java.util.Scanner;

public class DPE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        int[] values = new int[N + 1];
        long[] weights = new long[N + 1];

        long[][] dp = new long[N + 1][100001];

        for (int i = 1; i <= N; i++) {
            weights[i] = sc.nextLong();
            values[i] = sc.nextInt();
        }

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= 100000; j++) {
                if (j == 0) {
                    dp[i][j] = 0;
                } else if (i == 0) {
                    dp[i][j] = Long.MAX_VALUE;
                } else {
                    dp[i][j] = dp[i - 1][j]; // Not selecting the current item
                    if (j - values[i] >= 0 && dp[i - 1][j - values[i]] != Long.MAX_VALUE) {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - values[i]] + weights[i]);
                    }
                }
            }
        }

        long output = 0;
        for (int i = 0; i <= 100000; i++) {
            if (dp[N][i] <= W) {
                output = Math.max(output, i);
            }
        }
        System.out.println(output);
    }
}
