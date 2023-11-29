import java.util.*;
import java.io.*;

public class CCC05J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int evening = sc.nextInt();
        int weekend = sc.nextInt();
        int dayA = 0;
        if (day - 100 > 0) {
            dayA = (day - 100) * 25;
        } else {
            dayA = 0;
        }
        int eveningA = evening * 15;
        int weekendA = weekend * 20;
        double totalA = dayA + weekendA + eveningA;
        totalA /= 100;

        int dayB = 0;
        if (day - 250 > 0) {
            dayB = (day - 250) * 45;
        } else {
            dayB = 0;
        }
        int eveningB = evening * 35;
        int weekendB = weekend * 25;

        double totalB = dayB + weekendB + eveningB;
        totalB /= 100;
        System.out.print("Plan A costs ");
        System.out.printf("%.2f\n", totalA);
        System.out.print("Plan B costs ");
        System.out.printf("%.2f\n", totalB);
        if (totalA < totalB) {
            System.out.println("Plan A is cheapest.");
        } else if (totalA > totalB) {
            System.out.println("Plan B is cheapest.");
        } else {
            System.out.println("Plan A and B are the same price.");
        }
    }
}
