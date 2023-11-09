import java.util.Scanner;

public class Lesson15Quiz {
    public static void main(String[] args) {
        /*
        input a number A
        input a number B
        output A's binaryString
        output B's binaryString
        output A or B's binaryString
        output A and B's binaryString
        output A xor B's binaryString
        output A complement B's binaryString
        */
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Integer.toBinaryString(A));
        System.out.println(Integer.toBinaryString(B));
        System.out.println(Integer.toBinaryString(A | B));
        System.out.println(Integer.toBinaryString(A & B));
        System.out.println(Integer.toBinaryString(A ^ B));
        System.out.println(Integer.toBinaryString(~A));
        System.out.println(Integer.toBinaryString(~B));
    }
}
