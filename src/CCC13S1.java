import java.util.HashSet;
import java.util.Scanner;

public class CCC13S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(true) {
            year++;
            String s = year + "";
            HashSet<Character> set = new HashSet<>();
            for(int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            if(set.size() == s.length()) {
                System.out.println(year);
                break;
            }
        }
    }
}
