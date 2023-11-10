import java.util.Scanner;

public class CCC14J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int votes = sc.nextInt();
		String vt = sc.next();
		vt = vt.substring(0, (votes));
		String newVt = vt.replace("A", "");
		int SA = vt.length() - newVt.length();
		String newVt2 = vt.replace("B", "");
		int SB = vt.length() - newVt2.length();

		if (SA > SB) {
			System.out.println('A');
		} else if (SB > SA) {
			System.out.println('B');
		} else {
			System.out.println("Tie");
		}


	}

}
