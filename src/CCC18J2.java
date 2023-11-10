import java.util.*;
import java.io.*;
public class CCC18J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
String s1 = sc.next();
String s2 = sc.next();

int common = 0;
for (int i = 0; i<N; i++) {
	if (s1.charAt(i) == 'C') {
		if (s1.charAt(i) == s2.charAt(i)) {
			common += 1;
		}
	} 
}
System.out.println(common);
	}

}
