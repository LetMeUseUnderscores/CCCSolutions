import java.util.Arrays;

public class MinCostMemo {

    // Define the number of rows and columns
    static final int R = 3;
    static final int C = 3;

    // Utility function to find the minimum of three integers
    public static int min(int x, int y, int z) {
        if (x < y)
            return (x < z) ? x : z;
        else
            return (y < z) ? y : z;
    }

    // Recursive function to find the minimum cost path using memoization
    public static int minCostMemoized(int[][] cost, int m, int n, int[][] memo) {
        // Base case: if out of bounds, return a large value (to be ignored)
        if (n < 0 || m < 0)
            return Integer.MAX_VALUE;
            // Base case: if at the top-left corner, return the cost at that cell
        else if (m == 0 && n == 0)
            return cost[m][n];

        // Check if the result is already memoized
        if (memo[m][n] != -1)
            return memo[m][n];

        // Calculate the minimum cost to reach the current cell
        memo[m][n] = cost[m][n]
                + min(minCostMemoized(cost, m - 1, n - 1, memo),  //diagonal
                minCostMemoized(cost, m - 1, n, memo),   //above
                minCostMemoized(cost, m, n - 1, memo));  //right

        // Return the minimum cost
        return memo[m][n];
    }

    public static void main(String[] args) {
        // Cost matrix for the grid
        int[][] cost = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };

        // Create a memoization table to store intermediate results
        int[][] memo = new int[R][C];
        for (int[] row : memo)
            Arrays.fill(row, -1); // Initialize memo table with -1

        // Call the memoized function to find the minimum cost
        System.out.println(minCostMemoized(cost, 2, 2, memo));
    }
}