import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CCC08S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> queue = new LinkedList<>();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            char[][] maze = new char[R][C];
            for (int r = 0; r < R; r++) {
                String s = sc.next();
                maze[r] = s.toCharArray();
            }
            int[][] step = new int[R][C];
            for (int r = 0; r < R; r++) {
                Arrays.fill(step[r], Integer.MAX_VALUE);
            }
            step[0][0] = 1;
            boolean[][] visited = new boolean[R][C];
            queue.add(0);
            queue.add(0);
            while (!queue.isEmpty()) {
                int r = queue.poll();
                int c = queue.poll();
                if (visited[r][c]) {
                    continue;
                }
                visited[r][c] = true;
                if (maze[r][c] == '+') {
                    if (r > 0 && maze[r - 1][c] != '*' && step[r - 1][c] > step[r][c] + 1) {
                        step[r - 1][c] = step[r][c] + 1;
                        queue.add(r - 1);
                        queue.add(c);
                    }
                    if (r < R - 1 && maze[r + 1][c] != '*' && step[r + 1][c] > step[r][c] + 1) {
                        step[r + 1][c] = step[r][c] + 1;
                        queue.add(r + 1);
                        queue.add(c);
                    }
                    if (c > 0 && maze[r][c - 1] != '*' && step[r][c - 1] > step[r][c] + 1) {
                        step[r][c - 1] = step[r][c] + 1;
                        queue.add(r);
                        queue.add(c - 1);
                    }
                    if (c < C - 1 && maze[r][c + 1] != '*' && step[r][c + 1] > step[r][c] + 1) {
                        step[r][c + 1] = step[r][c] + 1;
                        queue.add(r);
                        queue.add(c + 1);
                    }
                } else if (maze[r][c] == '-') {
                    if (c > 0 && maze[r][c - 1] != '*' && step[r][c - 1] > step[r][c] + 1) {
                        step[r][c - 1] = step[r][c] + 1;
                        queue.add(r);
                        queue.add(c - 1);
                    }
                    if (c < C - 1 && maze[r][c + 1] != '*' && step[r][c + 1] > step[r][c] + 1) {
                        step[r][c + 1] = step[r][c] + 1;
                        queue.add(r);
                        queue.add(c + 1);
                    }
                } else if (maze[r][c] == '|') {
                    if (r > 0 && maze[r - 1][c] != '*' && step[r - 1][c] > step[r][c] + 1) {
                        step[r - 1][c] = step[r][c] + 1;
                        queue.add(r - 1);
                        queue.add(c);
                    }
                    if (r < R - 1 && maze[r + 1][c] != '*' && step[r + 1][c] > step[r][c] + 1) {
                        step[r + 1][c] = step[r][c] + 1;
                        queue.add(r + 1);
                        queue.add(c);
                    }
                }
            }
            if (step[R - 1][C - 1] == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(step[R - 1][C - 1]);
            }
        }
    }
}
