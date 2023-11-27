import java.util.Scanner;

public class CCC18J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];
        for(int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }
        if(numbers[0] == 8 || numbers[0] == 9) {
            if(numbers[1] == numbers[2]) {
                if(numbers[3] == 8 || numbers[3] == 9) {
                    System.out.println("ignore");
                } else {
                    System.out.println("answer");
                }
            } else {
                System.out.println("answer");
            }
        } else {
            System.out.println("answer");
        }
    }
}
