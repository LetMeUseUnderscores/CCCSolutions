import java.util.Scanner;

public class CCC00J1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
        int count = 0;
        for (int i = 0; i < a - 1; i++) {
            System.out.print("    ");
            count++;
        }
        for (int i = 1; i <= b; i++) {
            System.out.printf("%3d", i);
            count++;
            if (count == 7 || i == b) {
                System.out.println();
                count = 0;
            } else {
                System.out.print(' ');
            }
        }

    }

}
