import java.util.Scanner;

public class CCC11J3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int count = 2;
        while (true) {
            int next = first - second;
            count++;
            if (next > second) {
                break;
            }
            first = second;
            second = next;

        }
        System.out.println(count);

    }

}
