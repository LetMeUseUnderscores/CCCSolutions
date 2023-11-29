import java.util.*;
import java.io.*;

public class CCC13J2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String newWord1 = word.replace("I", "");
        String newWord2 = newWord1.replace("O", "");
        String newWord3 = newWord2.replace("S", "");
        String newWord4 = newWord3.replace("H", "");
        String newWord5 = newWord4.replace("Z", "");
        String newWord6 = newWord5.replace("X", "");
        String newWord7 = newWord6.replace("N", "");

        int length = newWord7.length();

        if (length == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

}
