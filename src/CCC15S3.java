import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CCC15S3 {
    static Set<Integer> gates = new HashSet<>();
    public static boolean gateCheck(int gateNum) {
        if(gateNum <= 0) {
            return false;
        }
        if(!gates.add(gateNum)) {
            return gateCheck(gateNum - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int G = sc.nextInt();
        int P = sc.nextInt();
        for(int i = 0; i < P; i++) {
            int gi = sc.nextInt();
            if(!gateCheck(gi)) {
                break;
            }
        }
        System.out.println(gates.size());
    }
}
