import java.util.Scanner;

public class CCC17J3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int t = sc.nextInt();
        int distance = Math.abs(c - a) + Math.abs(d - b);
        if ((t - distance) >= 0 && (t - distance) % 2 == 0) {
            System.out.println('Y');
        } else {
            System.out.println('N');
        }
    }

}
