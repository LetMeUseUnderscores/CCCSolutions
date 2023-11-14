import java.util.Scanner;

public class CCC21S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] heights = new int[N + 1];
        int[] width = new int[N];
        for(int i = 0; i < N + 1; i++) {
            heights[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            width[i] = sc.nextInt();
        }
        double area = 0;
        for(int i = 0; i < N; i++) {
            area += (heights[i] + heights[i + 1]) * width[i];
        }
        System.out.println(area / 2);
    }
}
