import java.util.Arrays;
import java.util.Scanner;

public class CCC16S2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int N = sc.nextInt();
        int[] Dmoj = new int[N];
        int[] Peg = new int[N];
        for (int i = 0; i < N; i++) {
            Dmoj[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            Peg[i] = sc.nextInt();
        }
        Arrays.sort(Dmoj);
        Arrays.sort(Peg);
        int sum = 0;
        if (Q == 1) {
            for (int i = 0; i < N; i++) {
                if (Dmoj[i] > Peg[i]) {
                    sum += Dmoj[i];
                } else {
                    sum += Peg[i];
                }
            }
        } else {
            int j = N - 1;
            for (int i = 0; i < N; i++) {
                if (Dmoj[i] > Peg[j]) {
                    sum += Dmoj[i];
                } else {
                    sum += Peg[j];
                }
                j--;
            }
        }
        System.out.println(sum);
    }

}
