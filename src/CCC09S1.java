import java.util.Scanner;

public class CCC09S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		int i = 1;
		while(Math.pow(i, 6) <= b) {
			if(Math.pow(i, 6) >= a &&  Math.pow(i, 6) <= b) {
				count++;
			}
			i++;
			
		}
		System.out.println(count);
	}

}
