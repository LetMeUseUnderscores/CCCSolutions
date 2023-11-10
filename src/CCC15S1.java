import java.util.LinkedList;
import java.util.Scanner;

public class CCC15S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> total = new LinkedList<Integer>();
		int K = sc.nextInt();
		for(int i = 0; i < K; i++) {
			int n = sc.nextInt();
			if(n == 0) {
				total.remove(total.size()-1);
			} else {
				total.add(n);
			}
		}
		int sum = 0;
		while(!total.isEmpty()) {
			sum+=total.poll();
		}
		System.out.println(sum);
	}

}
