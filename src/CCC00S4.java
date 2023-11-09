import java.util.Arrays;
import java.util.Scanner;

public class CCC00S4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int N = sc.nextInt();
        int[] clubs = new int[N + 1];
        int[] dp = new int[distance + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); //Fill for later
        for(int i = 1; i < N + 1; i++) {
            clubs[i] = sc.nextInt(); //input how far each club can hit the golf ball
            dp[clubs[i]] = 1;        //the golf ball can end up (clubs[i]) metres away from the starting point, add one stroke
        }
        for(int i = 1; i < N + 1; i++) {
            for(int j = 1; j < distance + 1; j++) {                 //j is the distance to check
                if(j - clubs[i] >= 0 && dp[j - clubs[i]] != Integer.MAX_VALUE) { //The golf ball should be able to reach (j - clubs[i]) metres with at least 1 stroke
                    dp[j] = Math.min(dp[j], dp[j - clubs[i]] + 1);
                    //Finding the lowest amount of strokes, so if the current distance has already been reached by using fewer strokes, then keep that value
                }
            }   
        }
        if(dp[distance] != Integer.MAX_VALUE) { //If the target distance was met by a number of strokes
            System.out.println("Roberta wins in " + dp[distance]  + " strokes.");
        } else {                                    //If the target distance was not reached by any number of strokes
            System.out.println("Roberta acknowledges defeat.");
        }
    }
}
