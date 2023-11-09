import java.util.Scanner;

public class DPH {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] memo = new int[R][C];
        char[][] map = new char[R][C];
        for(int i = 0; i < R; i++) {
            String s = sc.next();
            map[i] = s.toCharArray();
        }
        for(int r = 0; r < R; r++) {
            for(int c = 0; c < C; c++) {
                if(map[r][c] == '#') {
                    memo[r][c] = 0;
                } else if(r == 0 && c == 0) {
                    memo[r][c] = 1;
                } else if (r==0)  {
                    memo[r][c] = memo[r][c-1];
                } else if (c==0) {
                    memo[r][c] = memo[r-1][c];
                } else {
                    memo[r][c] = (memo[r - 1][c] + memo[r][c - 1])%1000000007;
                }
            }
        }
        System.out.println(memo[R - 1][C - 1]);

    }
}
