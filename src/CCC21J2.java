import java.util.*;
import java.io.*;

public class CCC21J2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int biggest = Integer.MIN_VALUE;
        String winner = "";
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int price = sc.nextInt();
            if (price > biggest) {
                biggest = price;
                winner = name;
            }
        }
        System.out.println(winner);
    }

}
