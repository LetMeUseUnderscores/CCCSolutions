import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CCC07J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minDistance = sc.nextInt();
        int maxDistance = sc.nextInt();
        int addMotels = sc.nextInt();
        List<Integer> motelLocations = new ArrayList<>();
        motelLocations.add(0);
        motelLocations.add(990);
        motelLocations.add(1010);
        motelLocations.add(1970);
        motelLocations.add(2030);
        motelLocations.add(2940);
        motelLocations.add(3060);
        motelLocations.add(3930);
        motelLocations.add(4060);
        motelLocations.add(4970);
        motelLocations.add(5030);
        motelLocations.add(5990);
        motelLocations.add(6010);
        motelLocations.add(7000);

        for(int i = 0; i < addMotels; i++) {
            motelLocations.add(sc.nextInt());
        }
        Collections.sort(motelLocations);

        int[] dp = new int[motelLocations.size()];
        dp[0] = 1;
        for (int i = 1; i < motelLocations.size(); i++) {
            for (int j = 0; j < i; j++) {
                int distance = motelLocations.get(i) - motelLocations.get(j);
                if (distance >= minDistance && distance <= maxDistance) {
                    dp[i] += dp[j];
                }
            }
        }
        System.out.println(dp[dp.length - 1]);
    }
}
