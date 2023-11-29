import java.util.Scanner;

public class CCC23J5 {
    static char[][] grid;
    static int count;
    static String word;
    public static void dfs(int row, int col, int index, int changeX, int changeY, boolean dirChanged) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return;
        }
        if(grid[row][col] != word.charAt(index)) {
            return;
        }
        if(index == word.length() - 1) {
            count++;
            return;
        }
        dfs(row + changeX, col + changeY, index + 1, changeX, changeY, dirChanged);
        if(!dirChanged && index > 0) {
            dfs(row - changeY, col + changeX, index + 1, -changeY, changeX, true);
            dfs(row + changeY, col - changeX, index + 1, changeY, -changeX, true);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        word = sc.next();
        int R = sc.nextInt();
        int C = sc.nextInt();
        grid = new char[R][C];
        for(int r = 0; r < R; r++) {
            for(int c = 0; c < C; c++) {
                grid[r][c] = sc.next().charAt(0);
            }
        }
        count = 0;
        for(int r = 0; r < R; r++) {
            for(int c = 0; c < C; c++) {
                if(grid[r][c] == word.charAt(0)) {
                    dfs(r, c, 0, -1, 0, false);
                    dfs(r, c, 0, 1, 0, false);
                    dfs(r, c, 0, 0, -1, false);
                    dfs(r, c, 0, 0, 1, false);
                    dfs(r, c, 0, -1, 1, false);
                    dfs(r, c, 0, -1, -1, false);
                    dfs(r, c, 0, 1, 1, false);
                    dfs(r, c, 0, 1, -1, false);
                }
            }
        }
        System.out.println(count);
    }
}
