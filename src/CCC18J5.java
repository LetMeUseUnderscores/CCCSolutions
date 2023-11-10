import java.util.*;

public class CCC18J5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] graph = new boolean[N + 1][N + 1];
        LinkedList<Integer> ending = new LinkedList<Integer>();
        for (int page = 1; page < N + 1; page++) {
            int M = sc.nextInt();
            if (M == 0) {
                ending.add(page);
            }
            for (int j = 0; j < M; j++) {
                int nextPage = sc.nextInt();
                graph[page][nextPage] = true;
            }
        }
        int begin = 1;
        int step[] = new int[N + 1];
        Arrays.fill(step, Integer.MAX_VALUE);
        step[begin] = 1;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(begin);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int c = 1; c <= N; c++) {
                if (graph[cur][c] && step[c] > step[cur] + 1) {
                    step[c] = step[cur] + 1;
                    queue.add(c);
                }
            }
        }

        String reachable = "Y";
        for (int i = 1; i < N; i++) {
            if (step[i] == Integer.MAX_VALUE) {
                reachable = "N";
            }
        }
        System.out.println(reachable);

        int shortestPage = Integer.MAX_VALUE;
        for (int i = 0; i < ending.size(); i++) {
            if (step[ending.get(i)] < shortestPage) {
                shortestPage = step[ending.get(i)];
            }
        }

        System.out.println(shortestPage);
    }
}



