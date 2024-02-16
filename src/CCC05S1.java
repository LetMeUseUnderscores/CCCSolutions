import java.util.HashMap;
import java.util.Scanner;

public class CCC05S1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> keys = new HashMap<Character, Integer>();
        keys.put('A', 2);
        keys.put('B', 2);
        keys.put('C', 2);
        keys.put('D', 3);
        keys.put('E', 3);
        keys.put('F', 3);
        keys.put('G', 4);
        keys.put('H', 4);
        keys.put('I', 4);
        keys.put('J', 5);
        keys.put('K', 5);
        keys.put('L', 5);
        keys.put('M', 6);
        keys.put('N', 6);
        keys.put('O', 6);
        keys.put('P', 7);
        keys.put('Q', 7);
        keys.put('R', 7);
        keys.put('S', 7);
        keys.put('T', 8);
        keys.put('U', 8);
        keys.put('V', 8);
        keys.put('W', 9);
        keys.put('X', 9);
        keys.put('Y', 9);
        keys.put('Z', 9);
        int N = sc.nextInt();
        String output = "";
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            S = S.replace("-", "");
            for (int j = 0; j < 10; j++) {
                if ("QWERTYUIOPASDFGHJKLZXCVBNM".contains(S.charAt(j) + "")) {
                    output += keys.get(S.charAt(j));
                } else {
                    output += S.charAt(j);
                }
                if (output.length() == 3 || output.length() == 7) {
                    output += "-";
                }
            }
            System.out.println(output);
            output = "";
        }
    }
}
