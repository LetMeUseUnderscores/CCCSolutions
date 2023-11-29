import java.util.HashMap;
import java.util.Scanner;

public class CCC06J3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> key = new HashMap<Character, Integer>();
        key.put('a', 2);
        key.put('b', 22);
        key.put('c', 222);
        key.put('d', 3);
        key.put('e', 33);
        key.put('f', 333);
        key.put('g', 4);
        key.put('h', 44);
        key.put('i', 444);
        key.put('j', 5);
        key.put('k', 55);
        key.put('l', 555);
        key.put('m', 6);
        key.put('n', 66);
        key.put('o', 666);
        key.put('p', 7);
        key.put('q', 77);
        key.put('r', 777);
        key.put('s', 7777);
        key.put('t', 8);
        key.put('u', 88);
        key.put('v', 888);
        key.put('w', 9);
        key.put('x', 99);
        key.put('y', 999);
        key.put('z', 9999);
        while (true) {
            int count = 0;
            String input = sc.next();
            if (input.equals("halt")) {
                break;
            }
            int prev = 0;
            for (int i = 0; i < input.length(); i++) {
                int temp = key.get(input.charAt(i));
                count += (int) Math.log10(temp) + 1;
                if (temp % 10 == prev) {
                    count += 2;
                }
                prev = temp % 10;
            }
            System.out.println(count);
        }
    }

}
