import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class CCC14S3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            Stack<Integer> top = new Stack<Integer>();
            Stack<Integer> branch = new Stack<Integer>();
            for (int j = 0; j < N; j++) {
                top.push(sc.nextInt());
            }
            int lake = 1;
            while (!top.isEmpty()) {
                if (top.peek() == lake) {
                    top.pop();
                    lake++;
                } else if (branch.size() > 0) {
                    if (branch.peek() == lake) {
                        branch.pop();
                        lake++;
                    } else {
                        branch.push(top.peek());
                        top.pop();
                    }
                } else {
                    branch.push(top.peek());
                    top.pop();
                }
            }
            boolean isY = true;
            for (int j = 0; j < branch.size(); j++) {
                if (branch.peek() == lake) {
                    branch.pop();
                    lake++;
                } else {
                    isY = false;
                    break;
                }
            }
            if (isY) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
