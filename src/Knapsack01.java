import java.util.Scanner;

public class Knapsack01 {
    public static void main(String[] args) {

        //Goal: Find max value that is able to fit in the knapsack
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxW = sc.nextInt();

        //input object weights and values
        //test N = 3, maxW = 120, weights: 30, 40, 50 values: 1, 2, 3
        //test output should be 6
        int[] weight = new int[N + 1];
        int[] value = new int[N + 1];
        for(int i = 1; i < N + 1; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }

        //Memoization
        long[][] memo = new long[N + 1][maxW + 1];
        for(int obj = 1; obj < N + 1; obj++) {
            for(int testW = 1; testW < maxW + 1; testW++) {
                if(weight[obj] <= testW) { //If the object can be added
                    //Sets it to the larger value of: Previous object value, or value of current object plus other objects that can be added
                    memo[obj][testW] = Math.max(memo[obj - 1][testW], memo[obj - 1][testW - weight[obj]] + value[obj]);

                } else {                  // If the object cannot be added
                    //Sets it to the previous object value
                    memo[obj][testW] = memo[obj - 1][testW];
                }
            }
        }
        //outputs the largest possible value
        System.out.println(memo[N][maxW]);
    }
}
