import java.util.Scanner;

public class CCC12S1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int J = sc.nextInt() - 1;
        int count = 0;
        for (int i = 0; i < J; i++) {
            for (int j = 0; j < J; j++) {
                for (int k = 0; k < J; k++) {
                    if (i < j && j < k) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
