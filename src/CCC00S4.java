import java.util.Arrays;
import java.util.Scanner;

public class CCC00S4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int N = sc.nextInt();
        int[] clubs = new int[N + 1];
        int[] dp = new int[distance + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 1; i < N + 1; i++) {
            clubs[i] = sc.nextInt();
            dp[clubs[i]] = 1;
        }
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < distance + 1; j++) {
                if (j - clubs[i] >= 0 && dp[j - clubs[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - clubs[i]] + 1);
                }
            }
        }
        if (dp[distance] != Integer.MAX_VALUE) {
            System.out.println("Roberta wins in " + dp[distance] + " strokes.");
        } else {
            System.out.println("Roberta acknowledges defeat.");
        }
    }
}