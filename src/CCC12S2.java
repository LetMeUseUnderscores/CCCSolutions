import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CCC12S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aromaticNum = sc.nextLine();
        Map<Character, Integer> RomanNumerals = new HashMap<>();
        RomanNumerals.put('I', 1);
        RomanNumerals.put('V', 5);
        RomanNumerals.put('X', 10);
        RomanNumerals.put('L', 50);
        RomanNumerals.put('C', 100);
        RomanNumerals.put('D', 500);
        RomanNumerals.put('M', 1000);
        int prevN = 0;
        int prevR = 0;
        int total = 0;
        for (int i = 0; i < aromaticNum.length(); i += 2) {
            int N = aromaticNum.charAt(i) - '0';
            int R = RomanNumerals.get(aromaticNum.charAt(i + 1));
            if (R > prevR) {
                total -= 2 * prevN * prevR;
            }
            total += N * R;
            prevN = N;
            prevR = R;
        }
        System.out.println(total);
    }
}