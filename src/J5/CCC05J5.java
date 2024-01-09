import java.util.Scanner;

public class CCC05J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String S = sc.next();
            if (S.equals("X")) {
                break;
            }
            while (true) {
                boolean containsANA = S.contains("ANA");
                boolean containsBAS = S.contains("BAS");
                if (!containsBAS && !containsANA) {
                    break;
                }
                if (containsANA) {
                    S = S.replaceFirst("ANA", "A");
                }
                if (containsBAS) {
                    S = S.replaceFirst("BAS", "A");
                }
            }
            if (S.equals("A")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
