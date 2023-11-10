import java.util.LinkedList;
import java.util.Scanner;

public class CCC03J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> length = new LinkedList<Integer>();
		LinkedList<Integer> width = new LinkedList<Integer>();
		LinkedList<Integer> perimeter = new LinkedList<Integer>();
		while(true) {
			int C = sc.nextInt();
			if(C == 0) { 
				break;
			}
			double c = Math.floor(Math.sqrt(C));
			while(true) {
				if(C % c != 0) {
					c--;
				} else {
					int a = C;
					int b = (int)c;
					length.add(b);
					width.add(a/b);
					perimeter.add(b*2 + a/b*2);
					break;
				}
			}
		}
		while(!length.isEmpty()) {
			System.out.println("Minimum perimeter is " + perimeter.poll() + " with dimensions " + length.poll() + " x " + width.poll());
		}
	}

}
