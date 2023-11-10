import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC20S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(sc.readLine());
        int N = Integer.parseInt(sc.readLine());

        StringTokenizer st;
        int[][] escapeRoom = new int[M+1][N+1];
        for(int r = 1; r <= M; r++) {
            st = new StringTokenizer(sc.readLine());
            for(int i = 1; i <= N; i++) {
                escapeRoom[r][i] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] step = new int[M+1][N+1];
        for(int i = 0; i < M + 1; i++) {
            Arrays.fill(step[i], Integer.MAX_VALUE);
        }
        LinkedList<Integer> rcCheck = new LinkedList<>();

        step[1][1] = 0;

        rcCheck.add(1);
        rcCheck.add(1);

        boolean[] checked = new boolean[1000001];

        while(!rcCheck.isEmpty()) {
            int r = rcCheck.poll();
            int c = rcCheck.poll();
            int check = escapeRoom[r][c];
            if(!checked[check]) {
                checked[check] = true;
                for (int i = 1; i * i <= check; i++) {
                    if (check % i != 0) {
                        continue;
                    }
                    if (i <= M && check / i <= N && step[i][check/i] > step[r][c] + 1) {
                        step[i][check / i] = step[r][c] + 1;
                        rcCheck.add(i);
                        rcCheck.add(check / i);
                    }
                    if (i <= N && check / i <= M && step[check/i][i] > step[r][c] + 1) {
                        step[check / i][i] = step[r][c] + 1;
                        rcCheck.add(check / i);
                        rcCheck.add(i);
                    }
                }
            }
        }
        if(step[M][N] != Integer.MAX_VALUE) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
