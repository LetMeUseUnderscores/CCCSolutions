import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC13S4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(next()), M = Integer.parseInt(next());
        ArrayList<Integer>[] adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(next());
            int y = Integer.parseInt(next());
            adj[x].add(y);
        }

        int p = Integer.parseInt(next());
        int q = Integer.parseInt(next());
        int[] step = new int[N];
        Arrays.fill(step, Integer.MAX_VALUE);

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(p);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i : adj[cur]) {
                if (step[i] > step[cur] + 1) {
                    step[i] = step[cur] + 1;
                    queue.add(i);
                }
            }
        }
        if (step[q] != Integer.MAX_VALUE) {
            System.out.println("yes");
        } else {
            int[] step2 = new int[N];
            Arrays.fill(step2, Integer.MAX_VALUE);
            step2[q] = 0;
            queue.add(q);
            while(!queue.isEmpty()) {
                int cur = queue.poll();
                for(int i : adj[cur]) {
                    if(step2[i] > step2[cur] + 1) {
                        step2[i] = step2[cur] + 1;
                        queue.add(i);
                    }
                }
            }
            if(step2[p] != Integer.MAX_VALUE) {
                System.out.println("no");
            } else {
                System.out.println("unknown");
            }
        }
    }
    static String next() throws IOException {
        while(st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

}
