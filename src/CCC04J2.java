import java.util.Scanner;

public class CCC04J2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        while (X <= Y) {
            System.out.println("All positions change in year " + X);
            X += 60;
        }
    }

}
