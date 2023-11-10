import java.util.Scanner;

public class CCC12J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		String output = "";
		for(int i = 0; i < S.length(); i++) {
			int temp = S.charAt(i);
			int subtract = 3*(i+1) + K;
			if(temp - subtract < 65) {
				subtract -= temp-65;
				temp = 91-subtract;
			} else {
				temp -= subtract;
			}
			output += (char) temp;
		}
		System.out.println(output);
	}

}
