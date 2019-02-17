import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int numViolated = 0;
        for (int i = 0; i < 5; i++) {
            if (a == sc.nextInt()) {
                numViolated++;
            }
        }

        System.out.println(numViolated);
    }
}
