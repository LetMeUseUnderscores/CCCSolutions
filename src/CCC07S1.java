import java.util.Scanner;

public class CCC07S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInput = sc.nextInt();
        for(int i = 0; i < numInput; i++) { //Cutoff date: 1989 February 27
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            if(y < 1989) {
                System.out.println("Yes");
            } else if (y == 1989 && m < 2) {
                System.out.println("Yes");
            } else if (y == 1989 && m == 2 && d <= 27) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
