import java.util.Arrays;
import java.util.Scanner;

public class CCC10S1 {
    public static class Computer implements Comparable<Computer> {
        String name;
        int cost;

        public Computer(String n, int c) {
            name = n;
            cost = c;
        }

        public int compareTo(Computer o) {
            if (o.cost == this.cost) {
                return this.name.compareTo(o.name);
            }
            return Integer.compare(o.cost, this.cost);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Computer[] computers = new Computer[N];
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int D = sc.nextInt();
            int cost = 2 * R + 3 * S + D;
            computers[i] = new Computer(name, cost);
        }
        Arrays.sort(computers);

        if (N != 0) {
            if (N == 1) {
                System.out.println(computers[0].name);
            } else {
                System.out.println(computers[0].name);
                System.out.println(computers[1].name);
            }
        }
    }

}
