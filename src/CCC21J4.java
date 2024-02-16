package J4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CCC21J4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        String input = next();
        int numLarge = 0;
        int numMed = 0;
        int wrongMed = 0;
        int wrongSmall = 0;
        int LM = 0;
        int ML = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'L') numLarge++;
            else if(input.charAt(i) == 'M') numMed++;
        }
        for(int i = 0; i < numLarge; i++) {
            if(input.charAt(i) == 'M') {
                wrongMed++;
                ML++;
            } else if(input.charAt(i) == 'S') wrongSmall++;
        }
        for(int i = numLarge; i < numLarge + numMed; i++) {
            if(input.charAt(i) == 'L') {
                LM++;
                wrongMed++;
            } else if (input.charAt(i) == 'S') wrongSmall++;
        }
        System.out.println(wrongMed + wrongSmall - Math.min(ML, LM));
    }
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}
