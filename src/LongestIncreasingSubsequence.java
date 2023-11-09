import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] set = {50, 3, 10, 7, 40, 80};
        int[] dp = new int[set.length];
        Arrays.fill(dp, 1);
        for(int i = 1; i < set.length; i++) {
            for(int j = 0; j < i; j++) {
                if(set[i] > set[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        Arrays.sort(dp);
        System.out.println(dp[set.length - 1]);
    }
}
