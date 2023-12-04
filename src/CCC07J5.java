import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CCC07J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long minDistance = sc.nextInt();
        long maxDistance = sc.nextInt();
        long addMotels = sc.nextInt();
        List<Long> motelLocations = new ArrayList<>();
        motelLocations.add(0L);
        motelLocations.add(990L);
        motelLocations.add(1010L);
        motelLocations.add(1970L);
        motelLocations.add(2030L);
        motelLocations.add(2940L);
        motelLocations.add(3060L);
        motelLocations.add(3930L);
        motelLocations.add(4060L);
        motelLocations.add(4970L);
        motelLocations.add(5030L);
        motelLocations.add(5990L);
        motelLocations.add(6010L);
        motelLocations.add(7000L);

        for (int i = 0; i < addMotels; i++) {
            motelLocations.add(sc.nextLong());
        }
        Collections.sort(motelLocations);

        long[] dp = new long[motelLocations.size()];
        dp[0] = 1;
        for (int i = 1; i < motelLocations.size(); i++) {
            for (int j = 0; j < i; j++) {
                long distance = motelLocations.get(i) - motelLocations.get(j);
                if (distance >= minDistance && distance <= maxDistance) {
                    dp[i] += dp[j];
                }
            }
        }
        System.out.println(dp[dp.length - 1]);
    }
}
