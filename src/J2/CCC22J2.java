import java.util.*;
import java.io.*;

public class CCC22J2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int star = 0;
        for (int i = 0; i < N; i++) {
            int points = sc.nextInt();
            int fouls = sc.nextInt();
            int total = points * 5 - fouls * 3;
            if (total > 40) {
                star++;
            }

        }
        if (star == N) {
            System.out.println(star + '+');
        } else {
            System.out.println(star);
        }
    }

}
