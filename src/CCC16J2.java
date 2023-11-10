import java.util.*;
import java.io.*;
public class CCC16J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int n4=sc.nextInt();
int n5=sc.nextInt();
int n6=sc.nextInt();
int n7=sc.nextInt();
int n8=sc.nextInt();
int n9=sc.nextInt();
int n10=sc.nextInt();
int n11=sc.nextInt();
int n12=sc.nextInt();
int n13=sc.nextInt();
int n14=sc.nextInt();
int n15=sc.nextInt();
int n16=sc.nextInt();  

int r1Sum = n1 + n2 + n3 + n4;
int r2Sum = n5+n6+n7+n8;
int r3Sum = n9+n10+n11+n12;
int r4Sum = n13+n14+n15+n16;

int c1Sum = n1 + n5 + n9 + n13;
int c2Sum = n2 + n6 + n10 + n14;
int c3Sum = n3 + n7 + n11 + n15;
int c4Sum = n4 + n8 + n12 + n16;

if (r1Sum == r2Sum && r1Sum == r3Sum && r1Sum ==  r4Sum && r1Sum == c1Sum &&r1Sum ==  c2Sum &&r1Sum ==  c3Sum && r1Sum ==  c4Sum) {
	System.out.println("magic");
} else {
	System.out.println("not magic");
}


	}

}
