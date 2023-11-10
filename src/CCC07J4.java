import java.util.Scanner;

public class CCC07J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		A = A.replace(" ", "");
		B = B.replace(" ", "");
		int[] Acount = new int[26];
		int[] Bcount = new int[26];
		for(int i = 0; i < A.length(); i++) {
			Acount[A.charAt(i) - 'A']++;
		}
		for(int i = 0; i < A.length(); i++) {
			Bcount[B.charAt(i) - 'A']++;
		}
		boolean isAnagram = true;
		for(int i = 0; i < Acount.length; i++) {
			if(Acount[i] != Bcount[i]) {
				isAnagram = false;
			}
		}
		if(isAnagram) {
			System.out.println("Is an anagram.");
		} else {
			System.out.println("Is not an anagram.");
		}
	}

}
