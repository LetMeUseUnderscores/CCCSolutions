import java.util.*;
import java.io.*;
public class CCC12J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		String S = "";
		String X = "";
		String Sp = "";
		for (int i = 0; i<k; i++) {
			S += '*';
			X += 'x';		
			Sp += ' ';
		}
		for (int i = 0; i<k; i++) {
			System.out.print(S);
			System.out.print(X);
			System.out.print(S);
			System.out.println();
		}

		for (int i = 0; i<k; i++) {
			System.out.print(Sp);
			System.out.print(X);
			System.out.print(X);
			System.out.println();
		}
		for (int i = 0; i<k; i++) {
			System.out.print(S);
			System.out.print(Sp);
			System.out.print(S);
			System.out.println();
		}

	}

}
