import java.util.*;
import java.io.*;

public class CCC19J1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a3 = sc.nextInt();
        int a2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b3 = sc.nextInt();
        int b2 = sc.nextInt();
        int b1 = sc.nextInt();
        int ascore = a3 * 3 + a2 * 2 + a1;
        int bscore = b3 * 3 + b2 * 2 + b1;
        if (ascore > bscore) {
            System.out.println('A');
        } else if (ascore < bscore) {
            System.out.println('B');
        } else {
            System.out.println('T');
        }
    }

}
