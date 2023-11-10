import java.util.Scanner;

public class CCC14J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rounds = sc.nextInt();
		int Dscore = 100;
		int Ascore = 100;
		for (int i = 0; i < rounds; i++) {
			int A = sc.nextInt();
			int D = sc.nextInt();
			if (A > D) {
				Dscore -= A;
			} else if (D > A) {
				Ascore -= D;
			}
			
		}
		System.out.println(Ascore);
		System.out.println(Dscore);

	}

}
