import java.util.Arrays;
import java.util.Scanner;

public class CCC04J4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String shift = sc.nextLine();
        String message = sc.nextLine();
        message = message.replaceAll("[^A-Z]", "");
        char[][] key = new char[(int) Math.ceil(message.length() / shift.length()) + 1][shift.length()];
        int temp = 0;
        Arrays.fill(key[key.length - 1], '0');
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key[0].length; j++) {
                if (temp >= message.length()) {
                    break;
                }
                key[i][j] = message.charAt(temp);
                temp++;
            }
        }
        for (int c = 0; c < key[0].length; c++) {
            for (int r = 0; r < key.length; r++) {
                char curr = key[r][c];
                int shiftAmount = shift.charAt(c) - 'A';
                if (curr == '0') {
                    break;
                }
                if (curr + shiftAmount > 'Z') {
                    shiftAmount -= 'Z' - curr;
                    curr = 'A' - 1;
                }
                key[r][c] = (char) (curr + shiftAmount);
            }

        }
        for (int r = 0; r < key.length; r++) {
            for (int c = 0; c < key[0].length; c++) {
                if (key[r][c] != '0') {
                    System.out.print(key[r][c]);
                }
            }
        }
    }

}
