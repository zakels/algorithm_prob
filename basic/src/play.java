import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numZero = 0;
        for (int x = 0; x < 3; x++) {
            for (int i = 0; i < 4; i++) {
                int t = sc.nextInt();
                if (t == 0) {
                    numZero++;
                }
            }
            if (numZero == 0) {
                System.out.println("E");
            } else if (numZero == 1) {
                System.out.println("A");
            } else if (numZero == 2) {
                System.out.println("B");
            } else if (numZero == 3) {
                System.out.println("C");
            } else if (numZero == 4) {
                System.out.println("D");
            }
            numZero = 0;
        }
    }
}
