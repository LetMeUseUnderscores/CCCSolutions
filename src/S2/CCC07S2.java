import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class CCC07S2 {
    public static class Box implements Comparable<Box> {
        int l;
        int w;
        int h;
        int v;

        public Box(int length, int width, int height) {
            l = length;
            w = width;
            h = height;
            v = l * w * h;
        }

        @Override
        public int compareTo(Box o) {
            return Integer.compare(this.v, o.v);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumBoxes = sc.nextInt();
        Box[] boxes = new Box[NumBoxes];
        for (int i = 0; i < NumBoxes; i++) {
            Box box = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
            boxes[i] = box;
        }
        Arrays.sort(boxes);
        int NumItems = sc.nextInt();
        for (int i = 0; i < NumItems; i++) {
            int l = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
            for (int j = 0; j < boxes.length; j++) {
                int[] item = {l, w, h};
                int[] box = {boxes[j].l, boxes[j].w, boxes[j].h};
                Arrays.sort(item);
                Arrays.sort(box);
                if (item[0] <= box[0] && item[1] <= box[1] && item[2] <= box[2]) {
                    System.out.println(boxes[j].v);
                    break;
                }
                if (j == boxes.length - 1) {
                    System.out.println("Item does not fit.");
                }
            }
        }
    }
}
