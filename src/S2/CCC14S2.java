import java.util.Scanner;

public class CCC14S2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] students = new String[N];
        String[] students2 = new String[N];
        for (int i = 0; i < N; i++) {
            students[i] = sc.next();
        }
        for (int i = 0; i < N; i++) {
            students2[i] = sc.next();
        }
        boolean isPartnered = true;
        for (int i = 0; i < N; i++) {
            String value1 = students[i];
            String value2 = students2[i];
            int index1 = 0;
            int index2 = 0;
            for (int j = 0; j < N; j++) {
                if (students[j].equals(value2)) {
                    break;
                }
                index1++;
            }
            for (int j = 0; j < N; j++) {
                if (students2[j].equals(value1)) {
                    break;
                }
                index2++;
            }
            if (index1 != index2 || students[index1].equals(students2[index2])) {
                isPartnered = false;
                break;
            }
        }
        if (isPartnered) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }

    }

}
