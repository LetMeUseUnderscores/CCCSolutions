import java.util.LinkedList;
import java.util.Scanner;

public class CCC11S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<String> responses = new LinkedList<String>();
		LinkedList<String> answers = new LinkedList<String>();
		int N = sc.nextInt();
		int correct = 0;
		for(int i = 0; i < N; i++) {
			responses.add(sc.next());
		}
		for(int i = 0; i < N; i++) {
			answers.add(sc.next());
		}
		for(int i =0; i < N; i++) {
			if(answers.get(i).equals(responses.get(i))) {
				correct++;
			}
		}
		System.out.println(correct);
	}

}
