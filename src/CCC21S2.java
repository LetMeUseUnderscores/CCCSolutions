import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC21S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine()), K = Integer.parseInt(br.readLine());

        int[] rowFreq = new int[M];
        int[] colFreq = new int[N];

        for(int i = 0; i < K; i++) {
            String in = br.readLine();
            char type = in.charAt(0);
            int index = Integer.parseInt(in.substring(2));
            if(type == 'R') {
                rowFreq[index - 1]++;
            } else {
                colFreq[index - 1]++;
            }
        }
        int count = 0;
        for(int r = 0; r < M; r++) {
            for(int c = 0; c < N; c++) {
                int totalFreq = rowFreq[r] + colFreq[c];
                if(totalFreq % 2 == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
