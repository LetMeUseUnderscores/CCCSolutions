import java.util.*;
import java.io.*;
public class CCC15J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int month = sc.nextInt();
int day = sc.nextInt();

if (month < 2 || (month == 2 && day <18)) {
	System.out.println("Before");
} else if (month == 2 && day == 18) {
	System.out.println("Special");
} else {
	System.out.println("After");
}
		
		
		
		
	}

}
