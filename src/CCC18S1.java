import java.util.Arrays;
import java.util.Scanner;

public class CCC18S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] A = new double[N];
		for (int i = 0; i<N; i++) {
			A[i] = sc.nextDouble();
		}
		Arrays.sort(A);
		int p1 = N-1;
		int p2 = N-2;
		double smallest = Double.MAX_VALUE;
		double[] boundaries = new double[N];
		for(int i = N-1; p2>=0; i--) {
			boundaries[i] = (A[p1] - A[p2]) / 2;
			p1--;
			p2--;
		}
		for(int i = 0; i < N; i++) {
			if (i ==0 || i == N-1) {
				A[i] = boundaries[i];
			} else {
				A[i] = boundaries[i] + boundaries[i+1];;
			}
			if(A[i] < smallest && i != 0 && i!=N-1) {
				smallest = A[i];
			}
		}
		System.out.printf("%.1f", smallest);
	}

}
