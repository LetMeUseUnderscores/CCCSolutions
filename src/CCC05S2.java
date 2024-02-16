import java.util.Scanner;

public class CCC05S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();
        int startX = 0;
        int startY = 0;
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            startX += a;
            if (startX > c) {
                startX = c;
            } else if (startX < 0) {
                startX = 0;
            }

            startY += b;
            if (startY > r) {
                startY = r;
            } else if (startY < 0) {
                startY = 0;
            }
            System.out.println(startX + " " + startY);
        }
    }
}
