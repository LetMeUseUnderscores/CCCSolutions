import java.util.Scanner;

public class CCC14J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int angleA = sc.nextInt();
		int angleB = sc.nextInt();
		int angleC = sc.nextInt();

		if (angleA + angleB + angleC == 180 && angleA == 60 && angleB == 60 && angleC ==60) {
			System.out.println("Equilateral");
			
		} else if (angleA + angleB + angleC == 180 && (angleA == angleB || angleB == angleC || angleA == angleC)) {
			System.out.println("Isosceles");
		} else if (angleA + angleB + angleC == 180 && angleA != angleB && angleB != angleC && angleA != angleC) {
			System.out.println("Scalene");
		} else if (angleA + angleB + angleC != 180) {
			System.out.println("Error");
		}

		////Scanner sc = new Scanner(System.in);
		//
		//int angleA = sc.nextInt();
		//int angleB = sc.nextInt();
		//int angleC = sc.nextInt();
		//
		//if (angleA + angleB + angleC != 180) {
//			System.out.println('Error');
		//	
		//} else if (angleA == angleB || angleB == angleC || angleA == angleC) {
//			System.out.println('Isosceles');
		//} else if (angleA != angleB && angleB != angleC && angleA != angleC) {
//			System.out.println('Scalene');
		//} else if (angleA == 60 && angleB == 60 && angleC == 60) {
//			System.out.println('Equilateral');
		//}
		//Cleaner but has errors, no errors if clean from start
	}

}
