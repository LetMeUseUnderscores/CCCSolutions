import java.util.Scanner;
public class CCC20J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int N = sc.nextInt();
		int R = sc.nextInt();
		int day = 0;
		int total = N;
		while (true) {
			day++;
			N *= R;
			total += N;
			if (total > P) {
				break;
			}
			
		}
		System.out.println(day);
	


	}

}
