import java.util.Scanner;

public class tri1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
