import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CCC15S2 {

	public static int change(String S) {
		int m = 0;
		if(S.equals("M")) {
			m = 1;
		} else if(S.equals("L")) {
			m = 2;
		}
		return m;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int J = sc.nextInt();
		int A = sc.nextInt();
		List<Integer> jerseys = new ArrayList<>();
		for(int i = 0; i < J; i++) {
			jerseys.add(change(sc.next()));
		}
		int count = 0;
		for(int i = 0; i < A; i++) {
			int s = change(sc.next());
			int n = sc.nextInt() - 1;
			if (jerseys.get(n) >= s) {
				count++;
				jerseys.set(n, -1);
			}
		}
		System.out.println(count);
	}
}
