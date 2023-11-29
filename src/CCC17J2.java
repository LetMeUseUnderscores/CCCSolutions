import java.util.*;
import java.io.*;

public class CCC17J2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        int m = 1;
        int nn = N;
        for (int i = 0; i < k; i++) {
            m *= 10;
            nn += N * m;
        }
        System.out.println(nn);
    }

}
