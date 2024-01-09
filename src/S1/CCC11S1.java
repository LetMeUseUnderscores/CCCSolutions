
import java.util.Scanner;

public class CCC11S1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tcount = 0;
        int scount = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N + 1; i++) {
            String text = sc.nextLine();
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == 't' || text.charAt(j) == 'T') {
                    tcount++;
                } else if (text.charAt(j) == 's' || text.charAt(j) == 'S') {
                    scount++;
                }
            }

        }
        if (tcount > scount) {
            System.out.println("English");
        } else if (scount >= tcount) {
            System.out.println("French");
        }
    }

}
