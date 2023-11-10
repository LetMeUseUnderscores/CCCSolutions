import java.util.Scanner;

public class CCC00J2 {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int begin = sc.nextInt();
		int end = sc.nextInt();
		int count = 0;
		boolean isRotate = true;
		for (int number = begin; number < end; number++) {
			String S = number +"";
			isRotate = true;
			for (int i = 0; i < S.length(); i++) {
				char forward = S.charAt(i);
				char backward = S.charAt(S.length() - 1 - i);
				if ("018".contains(forward+"")) {
					if (forward != backward) {
						isRotate = false;
						break;
					}
				} else if (forward == '9') {
					if (backward != '6') {
						isRotate = false;
						break;
					}
				} else if (forward == '6') {
					if (backward != '9') {
						isRotate = false;
						break;
					}
				} else {
					isRotate = false;
					break;
				}
				if (isRotate = true && i == S.length() - 1 ) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
