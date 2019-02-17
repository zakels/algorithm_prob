import java.util.Scanner;

public class point {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        boolean consecutive = false;
        int point = 0;
        int multiplier = 1;

        for(int i = 0; i < a; i++) {
            b = sc.nextInt();
            if (b == 0) {
                consecutive = false;
                multiplier = 1;
            }
            if (b == 1) {
                if (consecutive) {
                    multiplier++;
                }
                consecutive = true;
                point += multiplier;
            }
        }
        System.out.print(point);

    }
}
