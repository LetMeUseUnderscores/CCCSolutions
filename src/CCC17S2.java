import java.util.Arrays;
import java.util.Scanner;

public class CCC17S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMeasurements = sc.nextInt();
        int[] input = new int[numMeasurements];
        for(int i = 0; i < numMeasurements; i++) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);
        int[] lowTide;
        int[] highTide;
        if(numMeasurements % 2 == 0) {
            highTide = new int[numMeasurements / 2];
            lowTide = new int[numMeasurements / 2];
            for(int i = numMeasurements / 2 - 1; i >= 0; i--) {
                lowTide[numMeasurements / 2 - i - 1] = input[i];
            }
            for(int i = numMeasurements / 2; i < numMeasurements; i++) {
                highTide[i - numMeasurements / 2] = input[i];
            }
            for(int i = 0; i < numMeasurements / 2; i++) {
                System.out.print(lowTide[i] + " ");
                System.out.print(highTide[i] + " ");
            }
        } else {
            lowTide = new int[numMeasurements / 2 + 1];
            highTide = new int[numMeasurements / 2];
            for (int i = numMeasurements / 2; i >= 0; i--) {
                lowTide[numMeasurements / 2 - i] = input[i];
            }
            for (int i = numMeasurements / 2 + 1; i < numMeasurements; i++) {
                highTide[i - numMeasurements / 2 - 1] = input[i];
            }
            System.out.print(lowTide[0] + " ");
            for (int i = 0; i < numMeasurements / 2; i++) {
                System.out.print(highTide[i] + " ");
                System.out.print(lowTide[i + 1] + " ");

            }
        }
    }
}
