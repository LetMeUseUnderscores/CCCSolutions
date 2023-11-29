import java.util.Scanner;

public class CCC17S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Swifts = new int[N];
        int[] Semaphores = new int[N];
        int sumSw = 0;
        for (int i = 0; i < N; i++) {
            Swifts[i] = sc.nextInt();
            sumSw += Swifts[i];
        }
        int sumSe = 0;
        for (int i = 0; i < N; i++) {
            Semaphores[i] = sc.nextInt();
            sumSe += Semaphores[i];
        }
        for (int i = N - 1; i >= 0; i--) {
            if (sumSw != sumSe) {
                sumSe -= Semaphores[i];
                sumSw -= Swifts[i];
            } else {
                System.out.println(i + 1);
                break;
            }

            if (i == 0) {
                System.out.println(i);
            }
        }
    }
}
