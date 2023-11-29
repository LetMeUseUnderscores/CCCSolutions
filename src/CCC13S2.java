import java.util.Scanner;

public class CCC13S2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int count = 0;
        int[] weight = new int[N];
        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
            sum += weight[i];
            if (sum > W) {
                if (i >= 3) {
                    sum += 3;
                } else {
                    sum += i;
                }
                break;
            } else {
                count++;
                if (i >= 3) {
                    sum -= weight[i - 3];
                }
            }

        }
        System.out.println(count);
    }

}
