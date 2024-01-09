import java.util.Arrays;
import java.util.Scanner;

public class CCC13J4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int C = sc.nextInt();
        int[] chores = new int[C];
        for (int i = 0; i < C; i++) {
            chores[i] = sc.nextInt();
        }
        Arrays.sort(chores);
        int sum = 0;
        int count = 0;
        for (int i : chores) {
            if (sum + i > T) {
                break;
            } else {
                sum += i;
                count++;
            }
        }
        System.out.println(count);


    }

}
