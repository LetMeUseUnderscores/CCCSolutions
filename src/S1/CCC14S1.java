import java.util.LinkedList;
import java.util.Scanner;

public class CCC14S1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> friends = new LinkedList<Integer>();
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            friends.add(i);
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int j = 1;
            int r = sc.nextInt();
            int r1 = r;
            while (r <= friends.size()) {
                friends.set(r - 1, 0);
                r += r1;
            }
            int index = 0;
            while (friends.contains(0)) {
                if (friends.get(index) == 0) {
                    friends.remove(index);
                } else {
                    index++;
                }
            }
        }

        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }


    }

}
