import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CCC24J5 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int R = nextInt();
        int C = nextInt();
        char[][] graph = new char[R][C];
        for(int i = 0; i < R; i++) {
            String in = next();
            for(int j = 0; j < in.length(); j++) {
                graph[i][j] = in.charAt(j);
            }
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('S', 1);
        hm.put('M', 5);
        hm.put('L', 10);
        int begin = nextInt();
        int end = nextInt();
        LinkedList<Integer> q = new LinkedList<>();
        q.add(begin);
        q.add(end);
        int count = 0;
        boolean[][] visited = new boolean[R][C];
        visited[begin][end] = true;
        while(!q.isEmpty()) {
            int r = q.poll();
            int c = q.poll();
            count += hm.get(graph[r][c]);
            if(r + 1 < R && graph[r + 1][c] != '*' && !visited[r + 1][c]) {
                q.add(r + 1);
                q.add(c);
                visited[r + 1][c] = true;
            }
            if(r - 1 >= 0 && graph[r - 1][c] != '*' && !visited[r - 1][c]) {
                q.add(r - 1);
                q.add(c);
                visited[r - 1][c] = true;
            }
            if(c + 1 < C && graph[r][c + 1] != '*' && !visited[r][c + 1]) {
                q.add(r);
                q.add(c + 1);
                visited[r][c + 1] = true;
            }
            if(c - 1 >= 0 && graph[r][c - 1] != '*' && !visited[r][c - 1]) {
                q.add(r);
                q.add(c - 1);
                visited[r][c - 1] = true;
            }
        }
        System.out.println(count);
    }
    static String next() throws IOException {
        while(st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}

