import java.util.*;
import java.io.*;

public class CCC07J3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int[] cases = new int[10];
        cases[0] = 100;
        cases[1] = 500;
        cases[2] = 1000;
        cases[3] = 5000;
        cases[4] = 10000;
        cases[5] = 25000;
        cases[6] = 50000;
        cases[7] = 100000;
        cases[8] = 500000;
        cases[9] = 1000000;

        int opened = sc.nextInt();
        for (int i = 0; i < opened; i++) {
            int o = sc.nextInt();
            cases[o - 1] = 0;
        }
        int banker = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += cases[i];
        }
        int average = sum / (10 - opened);
        if (banker > average) {
            System.out.println("deal");
        } else {
            System.out.println("no deal");
        }


    }

}
