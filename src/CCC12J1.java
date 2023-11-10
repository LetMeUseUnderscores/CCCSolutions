import java.util.Scanner;
public class CCC12J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int spe = sc.nextInt();
		int rec = sc.nextInt();
		
		if (rec <= spe) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else if (rec - spe <= 20 && rec - spe >= 1) {
			System.out.println("You are speeding and your fine is $100.");
		} else if (rec - spe <= 30 && rec - spe >= 21) {
			System.out.println("You are speeding and your fine is $270.");
		} else if (rec - spe >= 31) {
			System.out.println("You are speeding and your fine is $500.");
		}
		
		
	}

}
