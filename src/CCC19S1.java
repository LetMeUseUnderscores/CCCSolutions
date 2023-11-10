import java.util.Scanner;

public class CCC19S1 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] A= {{1, 2}, {3,4}};
        String N = sc.next();
        String N1 = N.replace("V", "");
        String N2 = N.replace("H", "");
        boolean isHorizontal = false;
        boolean isVertical = false;
        if (N1.length() % 2 !=0) {
            isHorizontal = true;
        }
        if (N2.length() % 2 !=0) {
            isVertical = true;
        }
        if (isHorizontal) {
            int B = A[0][0];
            int B1 = A[0][1];
            A[0][0] = A[1][0];
            A[0][1] = A[1][1];
            A[1][0] = B;
            A[1][1] = B1;
        }
        if (isVertical) {
            int B = A[0][0];
            int B1 = A[1][0];
            A[0][0] = A[0][1];
            A[1][0] = A[1][1];
            A[0][1] = B;
            A[1][1] = B1;
        }
        for(int i = 0; i < A.length; i++) {
            for (int j = 0; j<A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
	}

}
