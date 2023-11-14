import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCC98S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] text = new String[n];
        for(int i = 0; i < n; i++){
            text[i] = sc.nextLine();
        }
        List<String> fourLetterWords = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String[] words = text[i].split(" ");
            for (String word : words) {
                if (word.length() == 4) {
                    fourLetterWords.add(word);
                }
            }
            String output = text[i];
            while(!fourLetterWords.isEmpty()) {
                String replace = fourLetterWords.get(0);
                fourLetterWords.remove(0);
                output = output.replace(replace, "****");
            }
            System.out.println(output);
        }
    }
}
