import java.util.Scanner;

public class CCC20J4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String shiftedText = sc.next();
        boolean containsShifted = false;

        for(int i = 0; i < text.length() + 1; i++) {
            if(text.contains(shiftedText)) {
                containsShifted = true;
                break;
            }
            shiftedText = shiftedText.substring(1) + shiftedText.charAt(0);
        }
        if(containsShifted) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
