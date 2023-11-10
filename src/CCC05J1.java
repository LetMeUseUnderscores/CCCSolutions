import java.util.*;
import java.io.*;
public class CCC05J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
int day = sc.nextInt();
int even = sc.nextInt();
int weekend = sc.nextInt();

int pA = (day - 100)*25 + even*15 + weekend*20;

if (day <= 100) {
	pA = even*15 + weekend*20;
}

int pB = (day - 250)*45 + even*35 + weekend*25;

if (day <= 250) {
	pB = even*35 + weekend*25;
}

System.out.println("Plan A costs " + pA/100.0);
System.out.println("Plan B costs " + pB/100.0);

if (pA < pB) {
	System.out.println("Plan A is cheapest.");
	
} else if (pA>pB) {
	System.out.println("Plan B is cheapest");
} else {
	System.out.println("Plan A and B are the same price.");
}
		
		
		
		
		
		
	}

}
