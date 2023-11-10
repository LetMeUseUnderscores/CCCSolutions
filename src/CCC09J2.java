import java.util.Scanner;

public class CCC09J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int trout = sc.nextInt();
		int pike = sc.nextInt();
		int pickerel = sc.nextInt();
		int total = sc.nextInt();
		int count = 0;
		int troutmax = total/trout;
		int pikemax = total/pike;
		int pickerelmax = total/pickerel;
		
		for (int f1 = 0; f1 <= troutmax; f1++) {
			for (int f2 = 0; f2 <= pikemax; f2++) {
				for (int f3 = 0; f3 <= pickerelmax; f3++) {
					if (f1*trout + f2*pike + f3*pickerel <= total) {
						if (f1 == 0 && f2 == 0 && f3 ==0) {
						} else {	
							System.out.println(f1 + " Brown Trout, " + f2 + " Northern Pike, " + f3 + " Yellow Pickerel");
							count++;
						}
					}
					
				}
			}
		}
		System.out.println("Number of ways to catch fish: " + count);
			
	}

}
