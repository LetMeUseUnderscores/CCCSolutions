import java.util.LinkedList;
import java.util.Scanner;

public class CCC14S3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int j = 0; j < T; j++) {
			LinkedList<Integer> A = new LinkedList<Integer>();
			LinkedList<Integer> branch = new LinkedList<Integer>();	
			int lake = 1;
			int N = sc.nextInt();
			for(int i = 0; i < N; i++) {
				A.add(sc.nextInt());
			}
			for(int i = A.size()-1; i>=0;i --) {
				if(A.get(A.size()-1) == lake) {
					A.remove(A.size()-1);
					lake++;
				} else if (branch.size() > 0) {
					if(branch.get(branch.size()-1) == lake) {
						branch.remove(branch.size()-1);
						lake++;
					} else {
						branch.add(A.get(A.size()-1));
						A.remove(A.size()-1);
					}
				} else {
					branch.add(A.get(A.size()-1));
					A.remove(A.size()-1);
				}
			}
			boolean isYum = true;
			for(int i = 0; i < branch.size();i++) {
				if(branch.get(branch.size()-1) == lake) {
					branch.remove(branch.size()-1);
					lake++;
				} else {
					isYum = false;
					break;
				}
			}
			
			if(isYum) {
				System.out.println("Y");
			} else { 
				System.out.println("N");
			}
		}
		
	}
}
