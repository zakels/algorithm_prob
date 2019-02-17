import java.util.Scanner;

public class aminusb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, res;
        a = sc.nextInt();
        b = sc.nextInt();

        if (b > a) {
            System.out.print(-1);
        } else {
            res = a - b;
            System.out.print(res);
        }

    }
}
