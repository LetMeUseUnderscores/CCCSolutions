import java.util.Scanner;

public class CCC10J2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();
		int nik = 0;
		int byr = 0;
		int count1 = 0;
		int count2 = 0;
		while (true) {
			for (int i = 0; i < a; i++) {
				nik++;
				count1++;
				if (count1 > s) {
					break;
				}
			}
			if (count1 > s) {
				break;
			}
			for (int i = 0; i < b; i++) {
				nik--;
				count1++;
				if (count1 > s) {
					break;
				}
			}
			if (count1 > s) {
				break;
			}
			
		}
		while (true) {
			for (int i = 0; i < c; i++) {
				byr++;
				count2++;
				if (count2 > s) {
					break;
				}
			}
			if (count2 > s) {
				break;
			}
			for (int i = 0; i < d; i++) {
				byr--;
				count2++;
				if (count2 > s) {
					break;
				}
			}
			if (count2 > s) {
				break;
			}
			
		}
		if (nik > byr) {
			System.out.println("Nikky");
		} else if (nik < byr) {
			System.out.println("Byron");
		} else {
			System.out.println("Tied");
		}
		

		
	}

}
