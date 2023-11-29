import java.util.Scanner;

public class CCC08J3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        char[][] key = {{'A', 'B', 'C', 'D', 'E', 'F'},
                {'G', 'H', 'I', 'J', 'K', 'L'},
                {'M', 'N', 'O', 'P', 'Q', 'R'},
                {'S', 'T', 'U', 'V', 'W', 'X'},
                {'Y', 'Z', ' ', '-', '.', ';'}};
        String S = sc.nextLine();
        int r = 0;
        int c = 0;
        int nr = 0;
        int nc = 0;
        int total = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int r1 = 0; r1 < key.length; r1++) {
                for (int c1 = 0; c1 < key[0].length; c1++) {
                    if (key[r1][c1] == S.charAt(i)) {
                        nr = r1;
                        nc = c1;
                    }
                }
            }
            int add = nr - r;
            if (add < 0) {
                add += add * -2;
            }
            int add1 = nc - c;
            if (add1 < 0) {
                add1 += add1 * -2;
            }
            total += add;
            total += add1;
            r = nr;
            c = nc;
        }
        total += 5 - r;
        total += 5 - c;
        total -= 1;
        System.out.println(total);


    }

}
