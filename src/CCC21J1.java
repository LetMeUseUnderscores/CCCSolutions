import java.util.Scanner;

public class CCC21J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int pres = 5 * temp - 400;
        if (pres == 100) {
            System.out.println(pres);
            System.out.println(0);
        } else if (pres > 100) {
            System.out.println(pres);
            System.out.println(-1);
        } else if (pres < 100) {
            System.out.println(pres);
            System.out.println(1);
        }
    }
}
