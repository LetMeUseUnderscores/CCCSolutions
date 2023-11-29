import java.util.Scanner;

public class CCC18J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cities = new int[5];
        cities[0] = 0;
        for (int i = 1; i < 5; i++) {
            cities[i] = sc.nextInt();
        }
        int[] prefixSum = new int[5];
        prefixSum[0] = 0;
        for (int i = 1; i < 5; i++) {
            prefixSum[i] = prefixSum[i - 1] + cities[i];
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Math.abs(prefixSum[i] - prefixSum[j]) + " ");
            }
            System.out.println();
        }
    }
}
