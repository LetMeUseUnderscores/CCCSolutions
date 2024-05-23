import java.util.Scanner;

public class CCC22J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int tighten = -1;
        String num = "";
        String strings = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tighten > 0) {
                if ("1234567890".contains(c + "") && i != s.length() - 1) {
                    num += c;
                } else {
                    if (i == s.length() - 1) num += c;
                    String e = tighten == 1 ? "loosen" : "tighten";
                    String out = strings + " " + e + " " + num;
                    System.out.println(out);
                    num = "";
                    strings = c + "";
                    tighten = -1;
                }
            } else if (c != '-' && c != '+') {
                strings += c;
            }
            if (c == '-' || c == '+') {
                if(c == '-') tighten = 1;
                else tighten = 2;
            }
        }
    }
}
