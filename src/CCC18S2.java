import java.io.*;
import java.util.*;

public class CCC18S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                A[r][c] = sc.nextInt();
            }
        }
        int srow = 0;
        int scol = 0;
        int smallest = Integer.MAX_VALUE;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (A[r][c] < smallest) {
                    smallest = A[r][c];
                    srow = r;
                    scol = c;
                }
            }
        }
        if (srow == 0 && scol == 0) {
            for (int r = srow; r < N; r++) {
                for (int c = scol; c < N; c++) {
                    System.out.print(A[r][c] + " ");
                }
                System.out.println();
            }
        } else if (srow == 0 && scol == N - 1) {
            for (int c = scol; c >= 0; c--) {
                for (int r = srow; r < N; r++) {
                    System.out.print(A[r][c] + " ");
                }
                System.out.println();
            }
        } else if (srow == N - 1 && scol == N - 1) {
            for (int r = srow; r >= 0; r--) {
                for (int c = scol; c >= 0; c--) {
                    System.out.print(A[r][c] + " ");
                }
                System.out.println();
            }
        } else if (srow == N - 1 && scol == 0) {
            for (int c = scol; c < N; c++) {
                for (int r = srow; r >= 0; r--) {
                    System.out.print(A[r][c] + " ");
                }
                System.out.println();
            }
        }
    }
}