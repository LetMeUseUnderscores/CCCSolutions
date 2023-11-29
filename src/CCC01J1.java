import java.util.*;
import java.io.*;

public class CCC01J1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        for (int i = 1; i < H; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < H * 2 - i * 2; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = H; i > 0; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < H * 2 - i * 2; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }


    }

}
