import java.util.Scanner;

public class DMOPC14c2p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] trees = new int[N];
        for(int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
        }
        int[] prefixSum = new int[N];
        prefixSum[0] = trees[0];
        for(int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + trees[i];
        }
        int Q = sc.nextInt();
        for(int i = 0; i < Q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > 0) {
                System.out.println(prefixSum[b] - prefixSum[a - 1]);
            } else {
                System.out.println(prefixSum[b]);
            }
        }
    }
}
