import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CCC06S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Character> cipher = new HashMap<>();
        String plainText = sc.nextLine();
        String correspondingText = sc.nextLine();
        String decipherText = sc.nextLine();
        for (int i = 0; i < plainText.length(); i++) {
            cipher.put(correspondingText.charAt(i), plainText.charAt(i));
        }
        String output = "";
        if (cipher.size() == 26) {
            String value = "ABCDEFGHIJUKLMNOPQRSTUVWXYZ ";
            char a = ' ';
            char b = ' ';
            for (int i = 0; i < 27; i++) {
                if (!cipher.containsValue(value.charAt(i))) {
                    a = value.charAt(i);
                }
                if (!cipher.containsKey(value.charAt(i))) {
                    b = value.charAt(i);
                }
            }
            cipher.put(b, a);
        }
        for (int i = 0; i < decipherText.length(); i++) {
            char c = decipherText.charAt(i);

            if (cipher.containsKey(c)) {
                output += cipher.get(c) + "";
            } else {
                output += ".";
            }
        }
        System.out.println(output);
    }
}
