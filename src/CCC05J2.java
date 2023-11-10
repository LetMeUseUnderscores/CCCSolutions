import java.util.Scanner;

public class CCC05J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int count = 0;
		for(int i = start; i <= end; i++) {
			int count2 = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count2++;
				}
			}
			if(count2 == 4) {
				count++;
			}
		}
		System.out.println("The number of RSA numbers between " + start +" and " + end + " is " + count);
	}

}
