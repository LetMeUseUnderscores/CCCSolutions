import java.util.*;
import java.io.*;

public class CCC16J1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String wL1 = sc.next();
        String wL2 = sc.next();
        String wL3 = sc.next();
        String wL4 = sc.next();
        String wL5 = sc.next();
        String wL6 = sc.next();

        int i = 0;
        if (wL1.equals('W')) {
            i = i + 1;
        }
        if (wL2.equals('W')) {
            i = i + 1;
        }
        if (wL3.equals('W')) {
            i = i + 1;
        }
        if (wL4.equals('W')) {
            i = i + 1;
        }
        if (wL5.equals('W')) {
            i = i + 1;
        }
        if (wL6.equals('W')) {
            i = i + 1;
        }

        if (i >= 5) {
            System.out.println(1);
        } else if (i >= 3) {
            System.out.println(2);
        } else if (i >= 1) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }

    }

}
