import java.util.LinkedList;
import java.util.Scanner;

public class CCC08J2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        LinkedList<String> songs = new LinkedList<String>();
        songs.add("A");
        songs.add("B");
        songs.add("C");
        songs.add("D");
        songs.add("E");
        while (true) {
            int b = sc.nextInt();
            int n = sc.nextInt();
            if (b == 1) {
                for (int i = 0; i < n; i++) {
                    songs.add(songs.poll());
                }
            } else if (b == 2) {
                for (int i = 0; i < n; i++) {
                    songs.addFirst(songs.pollLast());
                }

            } else if (b == 3) {
                for (int i = 0; i < n; i++) {
                    String a1 = songs.poll();
                    String b1 = songs.poll();
                    songs.addFirst(a1);
                    songs.addFirst(b1);
                }
            } else if (b == 4) {
                while (!songs.isEmpty()) {
                    System.out.print(songs.poll() + " ");
                }
                break;
            }
        }
    }

}
