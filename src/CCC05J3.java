import java.util.LinkedList;
import java.util.Scanner;

public class CCC05J3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList<String> Streets = new LinkedList<String>();
        LinkedList<String> Directions = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String A = sc.next();
            if (A.equals("R")) {
                Directions.add("LEFT");
            } else {
                Directions.add("RIGHT");
            }
            String S = sc.next();
            if (S.equals("SCHOOL")) {
                break;
            } else {
                Streets.add(S);
            }
        }
        while (Directions.size() != 1) {
            System.out.println("Turn " + Directions.pollLast() + " onto " + Streets.pollLast() + " street.");
        }
        System.out.println("Turn " + Directions.pollLast() + " into your HOME.");
    }

}
