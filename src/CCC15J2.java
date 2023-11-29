import java.util.*;
import java.io.*;

public class CCC15J2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String happy = sentence.replace(":-)", "");
        String sad = sentence.replace(":-(", "");

        int hs = sentence.length() - happy.length();
        int sh = sentence.length() - sad.length();


        if (sentence.contains(":-)") && hs > sh) {
            System.out.println("happy");
        } else if (sentence.contains(":-(") && hs < sh) {
            System.out.println("sad");
        } else if (sentence.contains(":-)") && hs == sh) {
            System.out.println("unsure");
        } else {
            System.out.println("none");
        }

    }

}
